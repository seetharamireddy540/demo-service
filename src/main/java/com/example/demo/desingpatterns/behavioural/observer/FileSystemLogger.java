package com.example.demo.desingpatterns.behavioural.observer;

public class FileSystemLogger implements Observer {

    private Subject subject;

    public FileSystemLogger(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        display(value);
    }

    @Override
    public void display(int value) {
        System.out.println("FileSystemLogger -> " + value);
    }
}
