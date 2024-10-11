package com.iutria.ecommerce.repository;

import com.iutria.ecommerce.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductRepositoryMysql implements DAO{

    private List<Product> products;

    public ProductRepositoryMysql() {
        products = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            products.add(new Product(
                    i,
                    "Product " + i,
                    10 + (500 - 10) * random.nextDouble()
            ));
        }
    }

    @Override
    public Product add(Product data) {
        data.setId(products.size());
        products.add(data);
        return data;
    }

    @Override
    public Product get(int id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public boolean update(Product data, int id) {
        //no tiene sentido que lo haga, porque la información no se guarda en una db
        return false;
    }

    @Override
    public boolean delete(int id) {
        //no tiene sentido que lo haga, porque la información no se guarda en una db
        return false;
    }
}
