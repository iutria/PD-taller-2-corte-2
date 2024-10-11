package com.iutria.ecommerce.repository;

import com.iutria.ecommerce.models.Product;

import java.util.*;

public class ProductRepositoryOracle implements DAO{

    Map<Integer, Product> products;

    public ProductRepositoryOracle() {
        products = new HashMap<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            Product product = new Product(
                    i,
                    "Product " + i,
                    10 + (500 - 10) * random.nextDouble()
            );
            products.put(i, product);
        }
    }

    @Override
    public Product add(Product data) {
        data.setId(products.size());
        this.products.put(data.getId(), data);
        return data;
    }

    @Override
    public Product get(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public boolean update(Product data, int id) {
        //no tiene sentido que lo haga, porque la información no se guarda en una db
        return true;
    }

    @Override
    public boolean delete(int id) {
        //no tiene sentido que lo haga, porque la información no se guarda en una db
        return true;
    }
}
