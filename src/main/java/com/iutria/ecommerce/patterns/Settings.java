package com.iutria.ecommerce.patterns;

public class Settings {
    public static DBFactory configure(String DB_TYPE) {
        switch (DB_TYPE){
            case "mysql": return new ConcreteMysqlFactory();
            case "oracle": return new ConcreteOracleFactory();
            default: return null;
        }
    }
}
