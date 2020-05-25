package com.example.demo.annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    public void testAdder() {
        Adder adder = (a, b, c) -> {
            return a + b;
        };
        adder.add(2, 3, 5);
    }

}