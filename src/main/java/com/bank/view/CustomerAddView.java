package com.bank.view;

import com.bank.domain.CheckAccount;
import com.bank.domain.Creator;
import com.bank.domain.Customer;
import com.bank.domain.SaveAccount;
import com.bank.sub.SizedListBox;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

@Route("add")
public class CustomerAddView extends VerticalLayout {
    TextField field;
    NumberField balance;
    NumberField option;
    Button addCustomerButton;
    Button addAccountButton;
    String[] customerName;
    SizedListBox<String> listBox;
    FileWriter writer;
    public CustomerAddView() {
        Anchor anchor = new Anchor("", "To the main page");
        field = new TextField("Enter name");
        addCustomerButton = new Button("Add new customer");
        addCustomerButton.addClickListener(click -> customerName = field.getValue().split("\\s"));
        addCustomerButton.addClickListener(click -> Creator.getBank().addCustomers(new Customer(customerName[0], customerName[1])));

        VerticalLayout layout = new VerticalLayout();
        layout.addAndExpand(field, addCustomerButton, anchor);
        add(layout);

        listBox = new SizedListBox<>();
        listBox.setWidth("10%");
        listBox.setItems("Create save account", "Create check account");
        listBox.setValue("Create save account");
        balance = new NumberField("Enter balance");
        option = new NumberField("Enter interest Rate");

        listBox.addValueChangeListener(event -> {
            if (listBox.getValue().equals("Create save account")) {
                option.setLabel("Enter interest Rate");

            } else {
                option.setLabel("Enter overdraft");
            }
        });

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setDefaultVerticalComponentAlignment(Alignment.END);
        horizontalLayout.addAndExpand(listBox, balance, option);
        add(horizontalLayout);

        addAccountButton = new Button("Add new account");
        addAccountButton.addClickListener(click -> createAcc());
        addAccountButton.addClickListener(click -> saveToData());



        add(addAccountButton);
    }

    public void createAcc() {
        if (listBox.getValue().equals("Create save account")) {
            Creator.getBank().getLastCustomer().addAccount(new SaveAccount(balance.getValue(), option.getValue()));
        } else {
            Creator.getBank().getLastCustomer().addAccount(new CheckAccount(balance.getValue(), option.getValue()));
        }
    }

    public void saveToData() {
//        try {
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            String json = gson.toJson(Creator.getBank());
//            writer = new FileWriter("src//main//resources//data//NewBankOut.json");
//            writer.write(json);
//            writer.flush();
//        } catch (IOException e) {
//            System.err.println("Some issue with saving");
//        }
    }


}
