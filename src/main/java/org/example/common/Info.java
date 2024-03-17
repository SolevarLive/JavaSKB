package org.example.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.dto.Operation;

@Getter
@Setter
@RequiredArgsConstructor
public class Info {
    private int id;

    private String date;


    public Info(Info info){
        this.id = info.id;
        this.date = info.date;
    }
}
