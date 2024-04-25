package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chocolate {
    private String type;
    private int quantity;

    public Chocolate(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
}
