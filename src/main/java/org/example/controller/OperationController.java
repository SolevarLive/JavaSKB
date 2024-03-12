package org.example.controller;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.example.dto.Operation;
import org.example.service.OperationServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operations")
@RequiredArgsConstructor
public class OperationController {

    private final OperationServiceDTO operationServiceDTO;


    @PostMapping("/opra")
    public Operation processJson(@RequestBody Operation operation) {
        operationServiceDTO.operations(operation);
        return operation;
    }


    @ExceptionHandler( Exception.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Custom 502 Error: " + e.getMessage());
    }
}