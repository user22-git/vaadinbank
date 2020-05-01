package com.bank.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;

public class Creator {
    static Bank bank;

    public void createBank() throws Exception {
        //FileReader reader = new FileReader("src//main//resources//data//NewBankOut.json");
        //bank = new Gson().fromJson(reader, Bank.class);
        bank = new Bank();

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(bank);
//        FileWriter writer = new FileWriter("C://TMP/NewBankOut.json");
//        writer.write(json);
//        writer.flush();
    }

    public static Bank getBank() {
        return bank;
    }

}
