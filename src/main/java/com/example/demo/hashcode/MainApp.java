package com.example.demo.hashcode;

public class MainApp {

    public static void main(String[] args) {
        Person person1 = new Person("Ram");
        Person person2 = new Person("Ram");
        System.out.println(" person -> " + person1);
        System.out.println(" person -> " + person2);
    }
}
