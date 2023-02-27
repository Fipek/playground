package com.fipek.playground.datastructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        //If we don't set any type in definition, we can keep several type data in our list
        //But this isn't desirable.
        List colorsWithoutType = new ArrayList<>();

        colorsWithoutType.add("blue");
        colorsWithoutType.add("purple");
        colorsWithoutType.add(1);
        colorsWithoutType.add(new Object());

        //We should set any type
        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("purple");

        //or

        //This list immutable. We can not change this after.
        List<String> colorsUnmodifiable = List.of("blue", "yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));

        //also
        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
