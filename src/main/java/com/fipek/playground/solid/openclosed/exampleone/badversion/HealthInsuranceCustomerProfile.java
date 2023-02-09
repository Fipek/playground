package com.fipek.playground.solid.openclosed.exampleone.badversion;

import java.util.Random;

public class HealthInsuranceCustomerProfile {

    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
