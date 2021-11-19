package org.example.patterns.creational.abstractFactory.impl;

import org.example.patterns.creational.abstractFactory.*;
import org.example.patterns.creational.factory.LinuxOS;
import org.example.patterns.creational.factory.MacOS;
import org.example.patterns.creational.factory.OS;
import org.example.patterns.creational.factory.WindowsOS;

public class RuCarPriceFactory implements InterAbsFactory {

    @Override
    public Car getCar(String carName) {
        Car car = switch (carName) {
            case "lada" -> new RuLadaImpl();
            case "porsche" -> new RuPorscheImpl();
            case "ferrari" -> new RuFerrariImpl();
            default -> null;
        };
        return car;
    }
}
