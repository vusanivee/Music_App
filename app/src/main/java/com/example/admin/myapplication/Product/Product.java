package com.example.admin.myapplication.Product;

/**
 * Created by admin on 2017/02/23.
 */
public class Product {
    private int id;
    private String name;
    private String price;
    private String description;

    //constructor


    public Product(int id, String name, String price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //

    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {

        this.description = description;
    }
}