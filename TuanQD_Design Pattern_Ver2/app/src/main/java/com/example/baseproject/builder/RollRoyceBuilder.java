package com.example.baseproject.builder;

import com.example.baseproject.model.Car;
import com.example.baseproject.model.Type;

public class RollRoyceBuilder implements Builder {
    private Type typeCar;
    private int seat;
    private int power;
    private String brand;

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

    @Override
    public Builder setType(Type typeCar) {
        this.typeCar = typeCar;
        return this;
    }

    @Override
    public Builder setSeat(int seat) {
        this.seat=seat;
        return this;
    }

    @Override
    public Builder setPower(int power) {
        this.power=power;
        return this;
    }

    @Override
    public Builder setBrand(String brand) {
        this.brand=brand;
        return this;
    }

    @Override
    public Car build() {
        return new Car(this);
    }
}
