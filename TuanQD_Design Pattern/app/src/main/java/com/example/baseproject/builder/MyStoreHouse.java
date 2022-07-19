package com.example.baseproject.builder;

public class MyStoreHouse {
    private static MyStoreHouse uniqueInstance;

    private MyStoreHouse() {
    }

    public static MyStoreHouse getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyStoreHouse();
        }
        return uniqueInstance;
    }
}
