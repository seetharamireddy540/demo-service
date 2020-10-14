package com.example.demo.multithreading.threadlocal;

public class Service2 {

    public void process() {
        System.out.println("Service2 - Processing User");
        User user = UserContextHolder.userThreadLocal.get();
        System.out.println(user.toString());
    }
}
