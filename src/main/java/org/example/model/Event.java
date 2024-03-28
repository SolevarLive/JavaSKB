package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @JoinColumn(name = "record_ID")
    @ManyToOne
    private Record record;

    @Override
    public String toString() {
        return this.name;
    }

}
