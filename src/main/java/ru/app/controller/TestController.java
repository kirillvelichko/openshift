package ru.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {
    private static final Random random = new Random();

    @GetMapping("")
    public String test() {
        return "Test message " + random.nextInt(100);
    }
}
