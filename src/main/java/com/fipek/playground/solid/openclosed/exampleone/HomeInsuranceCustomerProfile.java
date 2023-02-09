package com.fipek.playground.solid.openclosed.exampleone;

import java.util.Random;

public class HomeInsuranceCustomerProfile implements CustomerProfile{

    @Override
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
