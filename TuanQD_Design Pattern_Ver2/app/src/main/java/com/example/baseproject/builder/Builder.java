package com.example.baseproject.builder;

import com.example.baseproject.model.Car;
import com.example.baseproject.model.Type;

public interface Builder {
    Builder setType(Type typeCar);

    Builder setSeat(int seat);

    Builder setPower(int power);

    Builder setBrand(String brand);

    Car build();

}

