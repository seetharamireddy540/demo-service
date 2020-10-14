package com.example.demo.desingpatterns.behavioural.strategy;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.printf("I  am Flying...");
    }
}
