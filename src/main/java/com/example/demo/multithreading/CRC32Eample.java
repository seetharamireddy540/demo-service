package com.example.demo.multithreading;

import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class CRC32Eample {
    public static void main(String[] args) {

        String name = "Aa  Seetharamireddy Mittala ";
        byte[] nameByteArray = name.getBytes();
        System.out.printf("nameByteArray-" + Arrays.toString(nameByteArray));
        Checksum checksum = new CRC32();
        // update the current checksum with the specified array of bytes
        checksum.update(nameByteArray, 0, nameByteArray.length);
        // get the current checksum value
        long checksumValue = checksum.getValue();

        System.out.println("CRC32 checksum for input string is: " + checksumValue);
    }
}
