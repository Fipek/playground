package com.fipek.playground.solid.dependencyinversion.exampleone;

public class ProductFactory {

    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
