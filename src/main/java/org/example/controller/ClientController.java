package org.example.controller;

import org.example.dto.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    public Map<String,String> getClients(@RequestHeader Map<String,String> createClient) {
        return createClient;
    }

}
