package com.fipek.playground.solid.openclosed.badversion;

import java.util.Random;

public class VehicleInsuranceCustomerProfile {

    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}

