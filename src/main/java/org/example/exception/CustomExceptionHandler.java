package org.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler( CustomException.class)
    public ResponseEntity<String> handleException(CustomException e) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Custom 502 Error: " + e.getMessage());
    }
}