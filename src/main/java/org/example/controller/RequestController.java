package org.example.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/clients")
public class RequestController {

    @GetMapping
    public Map<String,String> getRequest(@RequestHeader Map<String,String> request) {
        return request;
    }

}
