package com.sparta.fk;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumbersList {

    public static void main(String[] args) {

        int maxInt = IntStream.rangeClosed(1, 100)
                .map(n -> n * n)
                .filter(n -> n < 100)
                .max()
                .getAsInt();



            System.out.println("Largest squared number less than 100: " + maxInt);


        }
}
