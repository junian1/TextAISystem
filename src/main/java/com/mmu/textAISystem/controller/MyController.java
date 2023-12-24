package com.mmu.textAISystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amna Hatem
 */
@RestController
public class MyController {

    @GetMapping("/test")
    public String get() {
        return "Hello, World!";
    }
}
