package com.example.demo.desingpatterns.behavioural.observer;

public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObServers();

    public void setValue(int val);
}
