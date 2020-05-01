package com.bank.domain;

import java.io.Serializable;

public class SaveAccount extends Account {
    //double balance;
    //double option;

    public SaveAccount(double balance, double option) {
        this.balance = balance;
        this.option = option;
    }

    public SaveAccount() {
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOption() {
        return option;
    }

    public void setOption(double option) {
        this.option = option;
    }
}
