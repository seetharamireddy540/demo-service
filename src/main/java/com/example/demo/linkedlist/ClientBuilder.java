package com.example.demo.linkedlist;

import lombok.Builder;

public class ClientBuilder {

    @Builder(builderMethodName = "immutableClientBuilder")
    public static ImmutableClient newClient(int id, String name) {
        return new ImmutableClient(id, name);
    }
}
