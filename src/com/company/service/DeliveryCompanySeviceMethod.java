package com.company.service;

import com.company.entities.Customer;
import com.company.entities.DeliveryCompany;
import com.company.entities.Order;

public interface DeliveryCompanySeviceMethod {

    int acceptOrder(DeliveryCompany deliveryCompany, Order order);

    void creatDeliveryCompany(DeliveryCompany deliveryCompany);

    int getTotalFee(Customer customer);

    int getCompanyProfit(DeliveryCompany deliveryCompany, Customer customer);
}
