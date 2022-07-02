package com.company;

import com.company.entities.Load;

import java.util.List;

public class Order {
    private String orderFee;
    private Load load;

    public Order(String orderFee, Load load) {
        this.orderFee = orderFee;
        this.load = load;
    }

    public String getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(String orderFee) {
        this.orderFee = orderFee;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "orderFee-'" + orderFee + '\'' +
                ", load-" + load;
    }
}
