package com.iutria.ecommerce.patterns;

import com.iutria.ecommerce.repository.DAO;

public abstract class DBFactory {
    public abstract DAO createConn();
}
