package ru.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Slf4j
public class TestController {
    private static final Random random = new Random();

    @GetMapping("")
    public String test() {
        String message = "Test message " + random.nextInt(100);
        log.info(message);
        return message;
    }
}
