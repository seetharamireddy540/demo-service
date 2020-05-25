package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        System.out.println(Thread.currentThread().getName() + " : Request1");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/ping")
    public String greeting() {
        return "pong";
    }
}