package com.fipek.playground.datastructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];

        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        //Print with for
        for(String color : colors){
            System.out.println(color);
        }

        //Print with stream
        Arrays.stream(colors).forEach(System.out::println);


    }
}
