package com.example.baseproject.builder;

import com.example.baseproject.model.Car;
import com.example.baseproject.model.Type;

public class CarDirector {

    public Car createMWSport(MWBuilder mwBuilder) {
        mwBuilder.setFuel(100);
        mwBuilder.setBrand("MW")
                .setType(Type.Sport)
                .setSeat(4)
                .setPower(800);
        return mwBuilder.build();
    }

    public Car createMWBusiness(MWBuilder mwBuilder) {
        mwBuilder.setFuel(100);
        mwBuilder.setBrand("MW")
                .setPower(600)
                .setSeat(4)
                .setType(Type.Business);
        return mwBuilder.build();
    }
    public Car createRollRoyceBusiness(Builder builder) {
        builder.setBrand("RollRoyce")
                .setPower(1000)
                .setSeat(2)
                .setType(Type.Business);
        return builder.build();
    }

    public Car createRollRoyceSport(Builder builder) {
        builder.setBrand("RollRoyce")
                .setPower(1200)
                .setSeat(2)
                .setType(Type.Sport);
        return builder.build();
    }
}
