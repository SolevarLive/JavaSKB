package org.example.service;

import org.example.dto.Operation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperationServiceDTO {
    List<Operation> operationList = new ArrayList<>();

    public void operations(Operation operation) {
        Operation newOperation = new Operation();
        newOperation.setInfo(operation.getInfo());
        newOperation.getInfo().setId(generateUniqueId());
        operationList.add(newOperation);
    }

    private int generateUniqueId() {
        return 123;
    }
}