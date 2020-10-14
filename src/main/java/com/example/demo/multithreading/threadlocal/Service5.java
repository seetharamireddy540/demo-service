package com.example.demo.multithreading.threadlocal;

public class Service5 {

    public void process() {
        System.out.println("Service5 - Processing User");
        User user = UserContextHolder.userThreadLocal.get();
        if(user == null) {
            System.out.println("User is not available");
        }
    }
}
