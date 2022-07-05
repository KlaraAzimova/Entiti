package com.company.service;

import com.company.entities.Customer;
import com.company.entities.DeliveryCompany;
import com.company.entities.Order;


import java.util.List;

public class DeliveryCompanyService implements DeliveryCompanySeviceMethod {
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
    public int acceptOrder(DeliveryCompany deliveryCompany, Order order) {
        for (int i = 0; i < deliveryCompanies.size(); i++) {
            if (deliveryCompanies.get(i).getDeliveryCompanyName().equals(deliveryCompany.getDeliveryCompanyName())){
                deliveryCompanies.get(i).getCustomer().get(i).getOrder();
            }

        }
        return 10;
    }

    @Override
    public void creatDeliveryCompany(DeliveryCompany deliveryCompany) {
        deliveryCompanies.add(deliveryCompany);

    }

    @Override
    public int getTotalFee(Customer customer) {
        for (DeliveryCompany d : deliveryCompanies) {
            return d.get(customer);
        }
        return 0;
    }

    @Override
    public int getCompanyProfit(DeliveryCompany deliveryCompany, Customer customer) {
        int companyProfitCounter = 0;
        for (DeliveryCompany company : deliveryCompanies) {
            if (company.getDeliveryCompanyName().equals(deliveryCompany.getDeliveryCompanyName())){
                companyProfitCounter += ((int) company.getPriceKilogram() * company)
            }

        }
        return companyProfitCounter;
    }
}
