package com.fipek.playground.solid.liskovsubstitution.badversion;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InhouseProduct();

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (Product product : products){
            if(product instanceof InhouseProduct) {
                // We should not have to ask about the kind of object (Tell, don't ask)
                ((InhouseProduct) product).applyExtraDiscount();
            }
            System.out.println(product.getDiscount());
        }
    }
}
