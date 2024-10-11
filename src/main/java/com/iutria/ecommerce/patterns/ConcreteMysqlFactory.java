package com.iutria.ecommerce.patterns;

import com.iutria.ecommerce.repository.DAO;
import com.iutria.ecommerce.repository.ProductRepositoryMysql;

public class ConcreteMysqlFactory extends DBFactory{
    @Override
    public DAO createConn() {
        return new ProductRepositoryMysql();
    }
}
