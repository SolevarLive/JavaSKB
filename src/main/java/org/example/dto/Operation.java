package org.example.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.common.Info;

@Getter
@Setter
@RequiredArgsConstructor
public class Operation {

    private double price;

    private Info info;

    public Operation(Operation operation){
        this.price = operation.price;
        this.info = new Info(operation.info);
    }
}
