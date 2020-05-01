package com.bank.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String FirstName;
    String LastName;

    List<Account> savingAcc;
    List<Account> checkingAcc;



    public Customer(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
        savingAcc = new ArrayList<>();
        checkingAcc = new ArrayList<>();
    }

    public Customer() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }




    public void addAccount(Account account) {
        if (account.getClass().equals(SaveAccount.class)) {
            savingAcc.add(account);
        } else if (account.getClass().equals(CheckAccount.class)) {
            checkingAcc.add(account);
        }
    }
    public List<Account> getSavingAccount() {
        return savingAcc;
    }

    public List<Account> getCheckingAccount() {
        return checkingAcc;
    }

    @Override
    public String toString() {
        return FirstName + " " + LastName;
    }
}
