package org.example.service;

import lombok.Getter;
import org.example.dto.Operation;
import org.example.service.info.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

@Service
public class OperationServiceDTO {
    @Autowired
    InfoService infoService;

    @Getter
    List<Operation> operationList = new CopyOnWriteArrayList<>();


    public void operations(Operation operation) {
        Operation newOperation = new Operation(infoService.getInfo(operation.getInfo()), operation);
        newOperation.getInfo().setId(generateUniqueId());
        operationList.add(newOperation);
    }

    private int generateUniqueId() {
        return 123;
    }
}