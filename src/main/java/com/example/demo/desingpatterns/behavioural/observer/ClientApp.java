package com.example.demo.desingpatterns.behavioural.observer;

import java.util.stream.IntStream;

public class ClientApp {

    public static void main(String[] args) {

        Subject subject  = new SubjectImpl();
        Observer cosoleObserver = new ConsoleLogger(subject);
        Observer fileSysmteObserver = new FileSystemLogger(subject);

        subject.setValue(10);

        IntStream.rangeClosed(1,10).forEach(value -> {
            System.out.println("Subject about to change the value.");
            subject.setValue(value);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
