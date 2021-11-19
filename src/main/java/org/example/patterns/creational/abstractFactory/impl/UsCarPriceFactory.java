package org.example.patterns.creational.abstractFactory.impl;

import org.example.patterns.creational.abstractFactory.*;

public class UsCarPriceFactory implements InterAbsFactory {

    @Override
    public Car getCar(String carName) {
        Car car = switch (carName) {
            case "lada" -> new UsLadaImpl();
            case "porsche" -> new UsPorscheImpl();
            case "ferrari" -> new UsFerrariImpl();
            default -> null;
        };
        return car;
    }
}
