package com.example.demo.linkedlist;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Singular;

import java.util.Set;

@Builder(toBuilder = true)
@EqualsAndHashCode
@Getter
public class Node {

    @Builder.Default
    private long created = System.currentTimeMillis();

    private int data;
    private Node next;

    @Singular
    private Set<String> occupations;
}
