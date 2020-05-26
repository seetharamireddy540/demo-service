package com.example.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@Slf4j
public class ServiceController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/test")
    public Greeting test(@RequestParam(value = "name", defaultValue = "World") String name) {

        log.info(Thread.currentThread().getName() + " : Request received");
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        greeting.setEpochTime(System.currentTimeMillis() / 1000);
        return greeting;
    }

    @GetMapping("/ping")
    public String greeting() {
        return "pong";
    }
}
