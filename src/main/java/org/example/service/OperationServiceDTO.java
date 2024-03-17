package org.example.service;

import lombok.Getter;
import lombok.Setter;
import org.example.common.Info;
import org.example.dto.Operation;
import org.springframework.stereotype.Service;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

@Service
public class OperationServiceDTO {

    @Getter
    List<Operation> operationList = new CopyOnWriteArrayList<>();

    public void operations(Operation operation) {
        Operation newOperation = new Operation(operation);
        newOperation.getInfo().setId(generateUniqueId());
        operationList.add(newOperation);
    }

    private int generateUniqueId() {
        return 123;
    }
}