package com.example.demo.exceptions;

public class HerdExceptionDemo {

    public static void main(String[] args) {

        HerdExecption execption = new HerdExecption("afdsffds");
        HerdExecption execption2 = new HerdObjectNotFoundException("afdsffds");
        System.out.println("execption2 ->" + execption2.getClass());

        System.out.println("HerdExecption ->" + execption.getClass());
    }
}
