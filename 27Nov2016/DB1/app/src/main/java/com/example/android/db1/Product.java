package com.example.android.db1;

/**
 * Created by zeeshanhanif-pc on 11/27/2016.
 */
public class Product{

    private int id;
    private String name;
    private int price;

    public Product(int id,  String name,int price) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
