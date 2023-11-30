package com.sparta.fk;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;



public class App
{
    public static void main( String[] args )
    {
        ArrayList<String> names = new ArrayList();
        names.add("Freya");
        names.add("Nicola");
        names.add("Charlie");
        names.add("Sara");
        names.add("Sam");
        names.add("Olivia");
        names.add("Hannah");
        names.add("Callum");

        List<String> sixLetterNames = names.stream()
        .filter(name -> name.length() == 6)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("6-letter names in the list:");
        sixLetterNames.forEach(System.out::println);


    }
}
