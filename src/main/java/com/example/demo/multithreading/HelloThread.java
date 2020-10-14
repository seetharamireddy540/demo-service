package com.example.demo.multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class HelloThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread Name " + Thread.currentThread().getName());
        System.out.println("Available Processors : " + Runtime.getRuntime().availableProcessors());

        IntStream.rangeClosed(1, 4).forEach(i -> {
            Thread t1 = new Thread(new Task());
            t1.start();
        });

        Thread.currentThread().join();
    }

    private static class Task implements Runnable {
        public static AtomicInteger counter = new AtomicInteger(1);

        static void incrementCounter() {
            System.out.println(Thread.currentThread().getName() + ": " + counter.getAndIncrement());
        }

        @Override
        public void run() {
            while (counter.get() < 20) {
                incrementCounter();
            }
        }
    }
}
