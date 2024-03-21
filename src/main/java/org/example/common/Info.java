package org.example.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Info {
    private int id;

    private String date;

    private String comment;


    public Info(Info info){
        this.id = info.id;
        this.date = info.date;
        this.comment = info.comment;
    }
}
