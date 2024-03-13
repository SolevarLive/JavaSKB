package org.example.errors;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

    private final String errorText = "not found";

    public CustomException(){
        super("error");
    }
}
