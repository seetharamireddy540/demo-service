package com.example.demo.controllers;

public class Greeting {

    private final long id;
    private final String content;

    private  long epochTime;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getEpochTime() {
        return epochTime;
    }

    public void setEpochTime(long epochTime) {
        this.epochTime = epochTime;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}