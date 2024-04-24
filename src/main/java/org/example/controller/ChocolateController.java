package org.example.controller;

import org.example.dto.Chocolate;
import org.example.service.ChocolateSVC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChocolateController {

    private final ChocolateSVC chocolateService;

    public ChocolateController(ChocolateSVC chocolateService) {
        this.chocolateService = chocolateService;
    }

    @GetMapping("/buy/{chocolateType}")
    public String buyChocolate(@PathVariable("chocolateType") String chocolateType) {
        chocolateService.incrementChocolateSales(chocolateType.toLowerCase());
        return chocolateType + " bought!";
    }

    @GetMapping("/sales/{chocolateType}")
    public Chocolate getChocolateSales(@PathVariable("chocolateType") String chocolateType) {
        return chocolateService.getChocolateSales(chocolateType.toLowerCase());
    }
}
