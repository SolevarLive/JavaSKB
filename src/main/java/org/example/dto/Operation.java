package org.example.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.common.Info;
import org.example.validation.MaxAndPositive;
import org.example.validation.OperationValidation;

@Getter
@Setter
@RequiredArgsConstructor
@OperationValidation
public class Operation {

    @MaxAndPositive
    private int price;

    private Info info;

    public Operation(Operation operation){
        this.price = operation.price;
        this.info = new Info(operation.info);
    }

}
