package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.common.RecordResponce;
import org.example.model.Record;
import org.example.service.RecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
@RequiredArgsConstructor
public class RecordController {

    private final RecordService recordService;

    @PostMapping("/create")
    public String saveRecord(@RequestBody RecordResponce recordResponce){
        recordService.saveResponce(recordResponce);
        return "Success";
    }

    @GetMapping("/get")
    public List<RecordResponce> getRecords() {
        return recordService.getRecords();
    }
}

