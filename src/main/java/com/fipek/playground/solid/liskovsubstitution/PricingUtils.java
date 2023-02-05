package com.fipek.playground.solid.liskovsubstitution;

import com.fipek.playground.solid.liskovsubstitution.badversion.Product;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils {

    public static void main(String[] args) {

        com.fipek.playground.solid.liskovsubstitution.badversion.Product p1 = new com.fipek.playground.solid.liskovsubstitution.badversion.Product();
        com.fipek.playground.solid.liskovsubstitution.badversion.Product p2 = new com.fipek.playground.solid.liskovsubstitution.badversion.Product();
        com.fipek.playground.solid.liskovsubstitution.badversion.Product p3 = new InhouseProduct();

        List<com.fipek.playground.solid.liskovsubstitution.badversion.Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (Product product : products){
            System.out.println(product.getDiscount());
        }
    }
}
