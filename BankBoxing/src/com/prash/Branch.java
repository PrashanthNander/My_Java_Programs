package com.prash;

import java.util.ArrayList;

public class Branch {

    public String getBranchName() {
        return branchName;
    }

    private String branchName;
    ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }


    public boolean addNewCustomer(String name, double initialAmnt) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name,initialAmnt));
            return true;
        }
        System.out.println("Customer already present");
        return false;
    }

    public void addAdditionalTransaction(String name, String additionalAmnt) {
        Customer existingCustomer =  findCustomer(name);
        if (existingCustomer != null) {

        }

    }

    public String findCustomer(String custName) {

        for (int i=0; i < customers.size(); i++) {
            if (custName.equals(customers.get(i).getCustomerName())) {
                System.out.println("Customer Found");;
                return "FOUND";
            }
        }
        return null;
    }

}
