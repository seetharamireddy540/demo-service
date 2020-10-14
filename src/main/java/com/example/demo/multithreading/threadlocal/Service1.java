package com.example.demo.multithreading.threadlocal;

public class Service1 {

    public static void main(String[] args) {
        Service1 service1 = new Service1();
        service1.process();
        Service2 service2  = new Service2();
        service2.process();
        Service3 service3  = new Service3();
        service3.process();
        Service4 service4  = new Service4();
        service4.process();

        Service5 service5  = new Service5();
        service5.process();

    }
    public void process() {
        User user = getUser();
        UserContextHolder.userThreadLocal.set(user);
        System.out.println("Service 1 Completed.");
        System.out.println(user.toString());
    }

    public User getUser() {
       return new User("Ram", "Mittala");
    }
}
