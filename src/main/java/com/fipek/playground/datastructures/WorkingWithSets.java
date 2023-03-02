package com.fipek.playground.datastructures;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    //Order doesn't guarantee
    //No duplication
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));

        balls.forEach(System.out::println);
    }

    static record Ball(String color){}
}
