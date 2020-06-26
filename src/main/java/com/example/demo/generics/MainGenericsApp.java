package com.example.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class MainGenericsApp {

    public static void main(String[] args) {

        List<Integer> listContainer = new ArrayList<>();
        listContainer.add(2);

        List<? extends Number> listWildContainer1 = new ArrayList<Number>();

        List<? super Integer> listWildContainer = new ArrayList<>();
        listWildContainer.add(2);

    }
}
