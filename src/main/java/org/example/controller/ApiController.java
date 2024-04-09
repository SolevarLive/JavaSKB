package org.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @PostMapping("/api/call")
    public String firstApiMethod() {
        return "Вызван API метод";
    }
}
