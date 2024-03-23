package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;

    public Event(String string){
        this.name = string;
    }
    public Event(){}

    @Override
    public String toString() {
        return this.name;
    }

}
