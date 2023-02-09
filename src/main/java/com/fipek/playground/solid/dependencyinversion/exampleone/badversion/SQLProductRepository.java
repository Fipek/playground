package com.fipek.playground.solid.dependencyinversion.exampleone.badversion;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository {

    public List<String> getAllProductNames(){
        return Arrays.asList("soap", "toothpaste");
    }
}
