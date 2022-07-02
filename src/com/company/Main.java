package com.company;

import com.company.entities.Load;
import com.company.service.DeliveryCompanyService;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Load load = new Load(10, 20, 30);
        Load load1 = new Load(15, 25, 35);
        Load load2 = new Load(20, 30, 40);


        Order order = new Order("Phone", load);
        Order order1 = new Order("Laptop", load1);
        Order order2 = new Order("Book", load2);

        List<Customer> customers = new ArrayList<>(List.of(
                new Customer("Muhammed", order),
                new Customer("Jaulan", order1),
                new Customer("Nurtilek", order2)));

        DeliveryCompany deliveryCompany = new DeliveryCompany("Taygan", customers);
        DeliveryCompany deliveryCompany1 = new DeliveryCompany("Glovo",customers);

        List<DeliveryCompany>deliveryCompaniesList = new ArrayList<DeliveryCompany>(List.of(
                deliveryCompany,deliveryCompany1));

        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(deliveryCompaniesList);
        deliveryCompaniesList.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------");
        deliveryCompanyService.creatDeliveryCompany(new DeliveryCompany("Yandex",customers));
        deliveryCompaniesList.forEach(System.out::println);

    }
}
