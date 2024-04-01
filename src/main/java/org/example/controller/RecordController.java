package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.common.RecordDTO;
import org.example.service.RecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
@RequiredArgsConstructor
public class RecordController {

    private final RecordService recordService;

    @PostMapping("/create")
    public String saveRecord(@RequestBody RecordDTO recordDTO){
        recordService.saveResponce(recordDTO);
        return "Success";
    }

    @GetMapping("/get")
    public List<RecordDTO> getRecords() {
        return recordService.getRecords();
    }
}

