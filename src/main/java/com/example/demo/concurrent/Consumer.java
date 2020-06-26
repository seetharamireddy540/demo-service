package com.example.demo.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;
    private final int poisonPill;

    public Consumer(BlockingQueue<Integer> queue, int poisonPill) {
        this.queue = queue;
        this.poisonPill = poisonPill;
    }

    @Override
    public void run() {
        System.out.println("Consumer thread started and start consuming...");
        try {
            while (true) {
                Integer number = queue.take();
                if (number.equals(poisonPill)) {
                    return;
                }
                System.out.println(Thread.currentThread().getName() + " result: " + number);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
