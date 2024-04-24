package org.example.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Endpoint(id = "currentTimeLogger")
public class TimeLoggerEndpoint {

    @ReadOperation
    public String logCurrentTime() {
        String message = "CurrentTimeLogger was called at " + LocalDateTime.now();
        System.out.println(message);
        return message;
    }
}