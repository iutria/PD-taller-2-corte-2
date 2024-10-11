package com.iutria.ecommerce.patterns;

import com.iutria.ecommerce.repository.DAO;
import com.iutria.ecommerce.repository.ProductRepositoryOracle;

public class ConcreteOracleFactory extends DBFactory{
    @Override
    public DAO createConn() {
        return new ProductRepositoryOracle();
    }
}
