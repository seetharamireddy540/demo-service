package com.example.demo.threadlocal;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class UserService {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main app started...");
        Thread t1 = new Thread(() -> {
            String birthDate = new UserService().birthDate(10);
            System.out.println(birthDate);
        });
        Thread t2 = new Thread(() -> {
            String birthDate = new UserService().birthDate(11);
            System.out.println(birthDate);
        });
        t1.start();
        t2.start();

        Thread.currentThread().join();
    }
    private String birthDate(int userId) {
        Date birthDate = birthDateFromDb(userId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(birthDate);
    }
    private Date birthDateFromDb(int userId) {
        LocalDateTime localDateTime = LocalDateTime.now();
        return Date.from(localDateTime.plusDays(userId).atZone(ZoneId.systemDefault()).toInstant());
    }
}
