package com.example.demo.multithreading.threadlocal;

public class Service3 {

    public void process() {
        System.out.println("Service3 - Processing User");
        User user = UserContextHolder.userThreadLocal.get();
        System.out.println(user.toString());
    }
}
