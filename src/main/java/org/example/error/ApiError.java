package org.example.error;

import org.example.aspect.LimitingAspect;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiError {
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    @ExceptionHandler(LimitingAspect.RateLimitExceededException.class)
    public String handleRateLimitExceeded(LimitingAspect.RateLimitExceededException e) {
        return e.getMessage();
    }
}
