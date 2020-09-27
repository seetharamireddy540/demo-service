package com.example.demo.exceptions;

public class HerdObjectNotFoundException extends  HerdExecption{

    public HerdObjectNotFoundException(String msg) {
        super(msg);
    }

    public HerdObjectNotFoundException(Throwable cause) {
        super(cause);
    }

    public HerdObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
