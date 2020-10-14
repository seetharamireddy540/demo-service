package com.example.demo.desingpatterns.structural.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ClientApp {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Mittala");

        Iterator<String> iterator =  stringList.iterator();

        Set<String> testSet= new HashSet<>();
        testSet.add("safdsf");
        testSet.add("sadfsfsdfs");
       // iterator = testSet.iterator();

        iterator.forEachRemaining((element) -> System.out.println(element));

    }
}
