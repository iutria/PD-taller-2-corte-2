package com.iutria.ecommerce.repository;

import com.iutria.ecommerce.models.Product;

import java.util.List;

public interface DAO {
    Product add(Product data);
    Product get(int id);
    List<Product> getAll();
    boolean update(Product data, int id);
    boolean delete(int id);
}
