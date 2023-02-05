package com.fipek.playground.solid.dependencyinversion.badversion;

public class ProductCatalog {
    // ProductCatalog is high-level module and directly dependent on SQLProductRepository
    // which is a low-level module. This is clear violation of the dependency inversion principle.

    public void listAllProducts() {
        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        sqlProductRepository.getAllProductNames();
        // List all products here
    }
}
