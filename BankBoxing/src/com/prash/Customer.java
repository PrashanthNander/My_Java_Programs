package com.prash;

import java.util.ArrayList;

public class Customer {

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactionAmnt() {
        return transactionAmnt;
    }

    private String customerName;
    private ArrayList<Double> transactionAmnt;

    public Customer(String customerName, double initialTransactAmount) {
        this.customerName = customerName;
        this.transactionAmnt = new ArrayList<Double>();
        addTransaction(initialTransactAmount);
    }

    public void addTransaction(double initialAmount) {
        this.transactionAmnt.add(initialAmount);
    }
}
