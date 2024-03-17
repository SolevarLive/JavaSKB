package org.example.dto;

import jdk.dynalink.Operation;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Client {
    private int id;

    private String name;

    private Operation operations;
}
