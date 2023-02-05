package com.fipek.playground.solid.dependencyinversion;

public class ProductFactory {

    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
