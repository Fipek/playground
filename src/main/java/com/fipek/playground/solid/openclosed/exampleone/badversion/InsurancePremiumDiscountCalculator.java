package com.fipek.playground.solid.openclosed.exampleone.badversion;

import com.fipek.playground.solid.openclosed.exampleone.HealthInsuranceCustomerProfile;

public class InsurancePremiumDiscountCalculator {

    public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer){

        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }

    public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer){

        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }
}
