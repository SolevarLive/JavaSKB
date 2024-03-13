package org.example.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CustomException extends RuntimeException{

    private final String errorText = "not found";

    public CustomException(){
        super("error");
    }
}
