package com.example.demo.exceptions;

public class HerdExecption extends Exception {

    private String msg;

    public HerdExecption(String msg) {
        this.msg = msg;
    }

    public HerdExecption(Throwable cause) {
        super(cause);
    }

    public HerdExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public String getMsg() {
        return msg;
    }

}
