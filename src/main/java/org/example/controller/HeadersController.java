package org.example.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/headers")
public class HeadersController {
    @GetMapping
    public Map<String, String> getHeaders(@RequestHeader Map<String, String> headers) {
        return headers;
    }
}
