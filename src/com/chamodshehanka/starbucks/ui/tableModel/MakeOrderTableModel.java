package com.chamodshehanka.starbucks.ui.tableModel;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author chamodshehanka on 12/5/2018
 * @project Starbucks
 **/
public class MakeOrderTableModel {

    private SimpleStringProperty itemCode = new SimpleStringProperty("");
    private SimpleStringProperty description = new SimpleStringProperty("");
    private SimpleDoubleProperty price = new SimpleDoubleProperty(0.0);
    private SimpleIntegerProperty qty = new SimpleIntegerProperty(0);

    public MakeOrderTableModel() {
    }

    public MakeOrderTableModel(SimpleStringProperty itemCode, SimpleStringProperty description, SimpleDoubleProperty price, SimpleIntegerProperty qty) {
        this.itemCode = itemCode;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public String getItemCode() {
        return itemCode.get();
    }

    public SimpleStringProperty itemCodeProperty() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode.set(itemCode);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public double getPrice() {
        return price.get();
    }

    public SimpleDoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public int getQty() {
        return qty.get();
    }

    public SimpleIntegerProperty qtyProperty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty.set(qty);
    }
}
