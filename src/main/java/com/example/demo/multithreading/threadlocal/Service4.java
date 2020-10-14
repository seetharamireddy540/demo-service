package com.example.demo.multithreading.threadlocal;

public class Service4 {

    public void process() {
        System.out.println("Service4 - Processing User");
        User user = UserContextHolder.userThreadLocal.get();
        System.out.println(user.toString());

        UserContextHolder.userThreadLocal.remove();
    }
}
