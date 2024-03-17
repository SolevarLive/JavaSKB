package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.dto.Operation;
import org.example.service.OperationServiceDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operations")
@RequiredArgsConstructor
public class OperationController {

    private final OperationServiceDTO operationServiceDTO;


    @PostMapping("/opra")
    public Operation processJson(@RequestBody Operation operation) {
        operationServiceDTO.operations(operation);
        return  operationServiceDTO.getOperationList().getLast();
    }
}