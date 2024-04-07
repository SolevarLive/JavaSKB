package org.example.service;

import jakarta.transaction.Transactional;
import org.example.common.RecordDTO;
import org.example.model.Event;
import org.example.model.Record;
import org.example.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RecordService {

    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository){
        this.recordRepository = recordRepository;
    }

    public List<RecordDTO> getRecords() {
        List<Record> list = recordRepository.findAll();
        List<RecordDTO> result = new ArrayList<>();
        for (Record i:list){
            result.add(new RecordDTO(i));
        }
        return result;
    }

    public void saveResponce(RecordDTO recordResponce) {
        Record record = new Record();
        record.setName(recordResponce.getName());

        for (String name : recordResponce.getEvents()) {
            Event event = new Event();
            event.setName(name);
            event.setRecord(record);
            record.getEvents().add(event);
        }

        recordRepository.save(record);
    }
}
