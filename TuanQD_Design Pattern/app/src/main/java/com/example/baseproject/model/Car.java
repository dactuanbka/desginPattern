package com.example.baseproject.model;

import com.example.baseproject.builder.MWBuilder;
import com.example.baseproject.builder.RollRoyceBuilder;

public class Car {
    private Type typeCar;
    private int seat;
    private int power;
    private int fuel;
    private String brand;


    public Car(MWBuilder mwBuilder) {
        this.typeCar = mwBuilder.getTypeCar();
        this.seat = mwBuilder.getSeat();
        this.power = mwBuilder.getPower();
        this.fuel = mwBuilder.getFuel();
        this.brand=mwBuilder.getBrand();
    }

    public Car(RollRoyceBuilder rollRoyceBuilder) {
        this.typeCar = rollRoyceBuilder.getTypeCar();
        this.seat = rollRoyceBuilder.getSeat();
        this.power = rollRoyceBuilder.getPower();
        this.brand=rollRoyceBuilder.getBrand();
    }

    public String getBrand() {
        return brand;
    }

    public Type getTypeCar() {
        return typeCar;
    }

    public int getSeat() {
        return seat;
    }

    public int getPower() {
        return power;
    }

    public int getFuel() {
        return fuel;
    }
}
