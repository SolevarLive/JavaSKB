package org.example.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Operation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperationServiceDTO {

    List<Operation> operationList = new ArrayList<>();

    public void operations(Operation operation) {
        int id = generateUniqueId();
        operation.getInfo().setId(id);
        operationList.add(operation);
    }

    private int generateUniqueId() {
        return 123;
    }
}
