package com.example.baseproject.builder;

import com.example.baseproject.model.Car;

public class MyStoreHouse {
    private static MyStoreHouse uniqueInstance;
    private Car mCar;

    private MyStoreHouse() {

    }

    public static MyStoreHouse getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyStoreHouse();
        }
        return uniqueInstance;
    }

    public void setCar(Car car) {
        this.mCar = car;
    }

    public Car getCar() {

        return mCar;
    }
}
