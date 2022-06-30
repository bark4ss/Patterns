package org.example.patterns.structural.adapter.impl;

import org.example.patterns.structural.adapter.MoveAble;
import org.example.patterns.structural.adapter.MoveAdapter;

public class MoveAdapterImpl implements MoveAdapter {

    private MoveAble car;

    public MoveAdapterImpl(MoveAble car){
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertKmToMiles();
    }

    private double convertKmToMiles() {
        return car.getSpeed() * 0.621;
    }
}
