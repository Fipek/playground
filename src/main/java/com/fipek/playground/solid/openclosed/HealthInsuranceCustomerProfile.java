package com.fipek.playground.solid.openclosed;

import java.util.Random;

public class HealthInsuranceCustomerProfile implements CustomerProfile{

    @Override
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
