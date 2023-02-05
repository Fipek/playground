package com.fipek.playground.solid.liskovsubstitution.badversion;

public class InhouseProduct extends Product {

    public void applyExtraDiscount(){
        discount = discount * 1.5;
    }
}
