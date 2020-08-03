package com.example.demo;

public class Ananya {

    public static void main(String[] args) {

        Long startTime = System.currentTimeMillis();
        for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(String.format("%d is Even number", i));
            } else {
                System.out.println(String.format("%d is ODD Number", i));
            }
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("Total Time to compute EVEN/ODD number is : " + ((endTime - startTime) / 1000) + "Secs");
    }
}
