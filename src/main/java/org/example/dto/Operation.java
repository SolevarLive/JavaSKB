package org.example.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.common.Info;
import org.example.validation.MaxAndNotNull;
import org.example.validation.OperationValidation;

@Getter
@Setter
@RequiredArgsConstructor
@OperationValidation
public class Operation {

    @MaxAndNotNull
    private int price;

    private Info info;

    private String name;

    public Operation(Info info, Operation operation){
        this.price = operation.price;
        this.info = info;
    }

}
