package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {
        long t0 = System.nanoTime();
        System.out.println(t0);
        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
        System.out.println("Classloader of Main:"
                + Main.class.getClassLoader());
        Properties prop = new Properties();
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("foo.properties");
        prop.load(inputStream);
        System.out.println(prop.toString());
        inputStream.close();
//        ClassLoader classLoader = Main.class.getClassLoader();
//        URL resource = classLoader.getResource("config/app.configuration");
//        if (resource == null) {
//            System.out.println("resource is  null");
//        } else {
//            System.out.println("resource is not null");
//        }
//        try (FileReader reader = new FileReader(new File(resource.getFile()));
//             BufferedReader br = new BufferedReader(reader)) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
