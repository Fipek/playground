package com.fipek.playground.solid.dependencyinversion.exampleone;

public class ProductCatalog {

    public void listAllProducts() {

        ProductRepository productRepository = ProductFactory.create();
        productRepository.getAllProductNames();
        // List all products here
    }
}
