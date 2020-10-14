package com.example.demo.multithreading.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class UserService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(50);

        IntStream.rangeClosed(1, 10000).forEach(value -> {
            executorService.submit(new Task(value));
            System.out.println("Submitted Task - " + value);
        });

        Thread.currentThread().join();
    }


    public String birthDate(int userId) {

        Date date = birthDateFromDb(userId);
        SimpleDateFormat dateFormat = ThreadSafeFormatter.dateFormatThreadLocal.get();
        return dateFormat.format(date);
    }

    private Date birthDateFromDb(int userId) {
        return new Date();
    }

    public static class Task implements Runnable {
        private int value;

        public Task(int value) {
            this.value = value;
        }

        @Override
        public void run() {

            String birthDate = new UserService().birthDate(200);
            System.out.println("Task Number : " + this.value + " Processed by ThreadName=" + Thread.currentThread().getName() + " -> BirthDate=" + birthDate);
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
