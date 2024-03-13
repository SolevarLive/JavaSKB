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
}
