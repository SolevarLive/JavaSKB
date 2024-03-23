package org.example.common;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.model.Event;
import org.example.model.Record;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class RecordResponce {
    private String name;
    private List<String> events;

    public RecordResponce(Record record){
        this.name = record.getName();
        List<Event> list = record.getEvents();
        List<String> result = new ArrayList<>();
        for (Event i:list) {
            result.add(i.toString());
        }
        this.events = result;
    }
}
