package com.bank.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bank extends Object implements Serializable {
//    List<Customer> customers;
//
//    public Bank() {
//        customers = new ArrayList<>();
//    }
//    public void addCustomers(Customer customer) {
//        customers.add(customer);
//    }
//
//    public Customer getCustomer(int id) {
//        return customers.get(id);
//    }

//    static List<Customer> customers;
//    static {
//        customers = new ArrayList<>();
//    }
//
//    public static void addCustomers(Customer customer) {
//        customers.add(customer);
//    }
//
//    public static Customer getCustomer(int id) {
//        return customers.get(id);
//    }

    List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomers(Customer customer) {
        customers.add(customer);
    }
    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public Customer getLastCustomer() {
        return customers.get(customers.size()-1);
    }

}
