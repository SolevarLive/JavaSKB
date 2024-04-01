package org.example.common;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.model.Event;
import org.example.model.Record;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Setter
@Getter
public class RecordDTO {
    private String name;
    private List<String> events;

    public RecordDTO(Record record){
        this.name = record.getName();
        List<Event> list = record.getEvents();
        List<String> result = new ArrayList<>();
        for (Event i:list) {
            result.add(i.toString());
        }
        this.events = result;
    }


}
