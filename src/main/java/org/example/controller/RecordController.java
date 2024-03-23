package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.common.RecordResponce;
import org.example.model.Record;
import org.example.repository.RecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/records")
@RequiredArgsConstructor
public class RecordController {

    private final RecordRepository recordRepository;

    @PostMapping("/create")
    public String saveRecord(@RequestBody Record record) {
        recordRepository.save(record);
        return "Success";
    }

    @GetMapping("/get")
    public List<RecordResponce> getRecords() {
        List<Record> list = recordRepository.findAll();
        List<RecordResponce> result = new ArrayList<>();
        for (Record i:list){
            result.add(new RecordResponce(i));
        }
        return result;
    }
}

