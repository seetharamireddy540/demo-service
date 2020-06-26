package com.example.demo.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainApp {

    public static void main(String[] args) throws InterruptedException {

        int BOUND = 10;
        int N_PRODUCERS = 4;
        int N_CONSUMERS = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of consumers - " + N_CONSUMERS);
        int poisonPill = Integer.MAX_VALUE;
        int poisonPillPerProducer = N_CONSUMERS / N_PRODUCERS;
        int mod = N_CONSUMERS % N_PRODUCERS;

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(BOUND);

//        for (int i = 1; i < N_PRODUCERS; i++) {
//            new Thread(new Producer(queue, poisonPill, poisonPillPerProducer)).start();
//        }
//
//        for (int j = 0; j < N_CONSUMERS; j++) {
//            new Thread(new Consumer(queue, poisonPill)).start();
//        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook is running !");
                try {
                    Thread.sleep(20000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

//        new Thread(new Producer(queue, poisonPill, poisonPillPerProducer + mod)).start();
//
        Thread.currentThread().join();

        System.out.println("Application Terminating ...");
    }
}
