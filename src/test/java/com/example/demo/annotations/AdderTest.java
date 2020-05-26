package com.example.demo.annotations;

import org.junit.jupiter.api.Test;

class AdderTest {

    @Test
    public void testAdder() {
        Adder adder = (a, b) -> {
            return a + b;
        };
        adder.add(2, 3);
    }

}