package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
@Component
public class LimitingAspect {

    private final ConcurrentHashMap<String, AtomicInteger> requestCountMap = new ConcurrentHashMap<>();

    @Value("${api.rate.limit}")
    private int maxRequests;

    @Pointcut("execution(public * org.example.controller.ApiController.*(..))")
    public void onApiCall() {
    }

    @Before("onApiCall()")
    public void beforeApiCall(JoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();

        AtomicInteger currentCount = requestCountMap.computeIfAbsent(methodName, k -> new AtomicInteger(0));
        if (currentCount.incrementAndGet() > maxRequests) {
            throw new RateLimitExceededException("Превышен лимит запросов к методу " + methodName);
        }
    }

    public static class RateLimitExceededException extends RuntimeException {
        public RateLimitExceededException(String message) {
            super(message);
        }
    }
}
