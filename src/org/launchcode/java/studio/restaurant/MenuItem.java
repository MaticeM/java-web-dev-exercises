package org.launchcode.java.studio.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {

    private int price;
    private String description;
    private String category;
    private Boolean newItem;

    public MenuItem(int price, String description, String category, Boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public MenuItem(int price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = false;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
