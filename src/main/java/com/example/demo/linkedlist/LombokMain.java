package com.example.demo.linkedlist;

public class LombokMain {

    public static void main(String[] args) {

        Node node1 = Node.builder().data(33)
                .occupation("343")
                .occupation("333")
                .build();

        Node node2 = Node.builder().data(33).build();

        Node.NodeBuilder nodeBuilder = node1.toBuilder();

        Node node3 = nodeBuilder.data(78).build();

        ClientBuilder.ImmutableClientBuilder immutableClientBuilder = ClientBuilder.immutableClientBuilder();

        ImmutableClient immutableClient = immutableClientBuilder
                .id(23)
                .name("sfd")
                .build();

        System.out.println(node1.getOccupations());
        System.out.println(node1.hashCode());
        System.out.println(node2.hashCode());
    }
}
