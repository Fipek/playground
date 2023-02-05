package com.fipek.playground.solid.liskovsubstitution;

import com.fipek.playground.solid.liskovsubstitution.badversion.Product;

public class InhouseProduct extends Product {

    @Override
    public double getDiscount() {
        this.applyExtraDiscount();
        return discount;
    }

    public void applyExtraDiscount(){
        discount = discount * 1.5;
    }
}
