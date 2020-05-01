package com.bank.view;

import com.bank.domain.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.NativeButtonRenderer;
import com.vaadin.flow.router.Route;



@Route
public class MainView extends VerticalLayout {
    Grid<Account> grid;
    ComboBox<String> comboBox;
    IntegerField field;
    public MainView() throws Exception{
        Anchor toAdd = new Anchor("/add", "go to add new user");
        field = new IntegerField("Set Customer Id");
        Button button = new Button("Get Customer by Id");
        TextField data = new TextField("Name of Customer");

        button.addClickListener(click -> data.setValue(Creator.getBank().getCustomer(field.getValue()).toString()));
        button.addClickListener(click -> listener() );

        HorizontalLayout layout = new HorizontalLayout(button, field, data, toAdd);
        layout.setDefaultVerticalComponentAlignment(Alignment.END);
        add(layout);

        comboBox = new ComboBox<>();
        comboBox.setLabel("Account Type");
        comboBox.setItems("Save account", "Check account");
        comboBox.setClearButtonVisible(true);
        comboBox.setValue("Save account");

        add(comboBox);
        grid = new Grid<>(Account.class);

        comboBox.addValueChangeListener(event -> {
            if (event.getValue().equals("Save account")) {
                grid.setItems(Creator.getBank().getCustomer(field.getValue()).getSavingAccount());
                grid.getColumnByKey("option").setHeader("Interest Rate");
            } else {
                grid.setItems(Creator.getBank().getCustomer(field.getValue()).getCheckingAccount());
                grid.getColumnByKey("option").setHeader("Overdraft");
            }
        });
        grid.addColumn(new NativeButtonRenderer<Account>("Редактировать", contact -> {
            //DO Nothing obviously
        }));
        add(grid);
    }

    public void listener() {
        if (comboBox.getValue().equals("Save account")) {
            grid.setItems(Creator.getBank().getCustomer(field.getValue()).getSavingAccount());
            grid.getColumnByKey("option").setHeader("Interest Rate");
        } else {
            grid.setItems(Creator.getBank().getCustomer(field.getValue()).getCheckingAccount());
            grid.getColumnByKey("option").setHeader("Overdraft");
        }
    }



}