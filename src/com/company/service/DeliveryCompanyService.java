package com.company.service;

import com.company.DeliveryCompany;
import com.company.Method;


import java.util.List;
import java.util.Set;

public class DeliveryCompanyService implements Method {
    private List<DeliveryCompany> deliveryCompanies;

    public DeliveryCompanyService(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public List<DeliveryCompany> getDeliveryCompanies() {
        return deliveryCompanies;
    }

    public void setDeliveryCompanies(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    @Override
    public void acceptOrder() {

    }

    @Override
    public void creatDeliveryCompany(DeliveryCompany deliveryCompany) {
        deliveryCompanies.add(deliveryCompany);

    }

    public DeliveryCompanyService() {
    }

    @Override
    public void getTotalFree() {

    }

    @Override
    public void getCompanyProfit() {

    }
}
