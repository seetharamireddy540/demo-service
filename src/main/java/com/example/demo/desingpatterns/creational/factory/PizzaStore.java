package com.example.demo.desingpatterns.creational.factory;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
    }
}
