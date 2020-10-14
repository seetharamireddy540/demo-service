package com.example.demo.multithreading.threadlocal;

public class UserContextHolder {
    public static ThreadLocal<User> userThreadLocal = new ThreadLocal<>();
}
