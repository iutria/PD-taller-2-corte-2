package com.iutria.ecommerce.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String description;
    private double price;


    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
}
