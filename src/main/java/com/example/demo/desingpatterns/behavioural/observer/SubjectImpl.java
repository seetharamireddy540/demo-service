package com.example.demo.desingpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observersList;
    private int value;

    public SubjectImpl() {
        this.observersList = new ArrayList<>();
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObServers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observersList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void notifyObServers() {
        observersList.stream().forEach(observer -> observer.update(this.value));
    }
}
