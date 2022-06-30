package org.example.patterns.structural.adapter;

import org.example.patterns.structural.adapter.impl.LadaMoveAbleImpl;
import org.example.patterns.structural.adapter.impl.MoveAdapterImpl;

public class TestAdapterPattern {
    public static void main(String[] args) {
        MoveAble car = new LadaMoveAbleImpl();
        MoveAdapter carSpeedAdapter = new MoveAdapterImpl(car);
        System.out.println(carSpeedAdapter.getSpeed());
    }
}
