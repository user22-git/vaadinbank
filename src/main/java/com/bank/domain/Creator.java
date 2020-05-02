package com.bank.domain;

import com.google.gson.Gson;
import org.springframework.core.io.ClassPathResource;

import java.io.*;

public class Creator {
    static Bank bank;

    public void createBank() {
        try {
            InputStream resource = new ClassPathResource("NewBankOut.json").getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource));
            bank = new Gson().fromJson(reader, Bank.class);
        } catch (IOException e) {
            bank = new Bank();
        }
        //FileReader reader = new FileReader("src//main//resources//data//NewBankOut.json");
        //bank = new Gson().fromJson(reader, Bank.class);
        //bank = new Bank();

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
