package com.example.demo.desingpatterns.behavioural.strategy;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck() {
    }
    public abstract void display();
    public abstract void swim();

    public void performQuack() {
        quackBehaviour.quack();
    }
    public void performFly() {
        flyBehaviour.fly();
    }
}
