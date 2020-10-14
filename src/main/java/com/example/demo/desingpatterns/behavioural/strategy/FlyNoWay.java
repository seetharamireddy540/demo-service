package com.example.demo.desingpatterns.behavioural.strategy;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.printf("I am not flying.");
    }
}
