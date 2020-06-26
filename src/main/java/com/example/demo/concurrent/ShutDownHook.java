package com.example.demo.concurrent;

public class ShutDownHook {
    public static void main(String[] args) throws InterruptedException {

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook is running !");
            }
        });
        Thread.currentThread().join();
        System.out.println("Application Terminating ...");
    }
}