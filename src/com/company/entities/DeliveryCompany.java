package com.company.entities;

import java.util.List;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final int priceKilogram = 200;
    private List<Customer> customer;
    private final int maxCapacityPerSquareMeter = 30;

    public DeliveryCompany(String deliveryCompanyName, List<Customer> customer) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customer = customer;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public int getPriceKilogram() {
        return priceKilogram;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public int getMaxCapacityPerSquareMeter() {
        return maxCapacityPerSquareMeter;
    }

    @Override
    public String toString() {
        return "DeliveryCompany: " +
                "deliveryCompanyName-'" + deliveryCompanyName + '\'' +
                ", priceKilogram-" + priceKilogram +
                ", customer-" + customer +
                ", maxCapacityPerSquareMeter-" + maxCapacityPerSquareMeter +
                '!';
    }
}
