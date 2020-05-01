package com.bank.domain;

import java.io.Serializable;

public class CheckAccount extends Account {
    //double balance;
    //double option;

    public CheckAccount(double balance, double option) {
        this.balance = balance;
        this.option = option;
    }

    public CheckAccount() {
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
