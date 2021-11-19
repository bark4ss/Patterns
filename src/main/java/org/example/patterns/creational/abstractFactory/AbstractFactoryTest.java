package org.example.patterns.creational.abstractFactory;

import org.example.patterns.creational.abstractFactory.impl.RuCarPriceFactory;
import org.example.patterns.creational.abstractFactory.impl.UsCarPriceFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        String country = "RU";
        InterAbsFactory iFactory = null;
        if(country.equals("US")) {
            iFactory = new UsCarPriceFactory();
        } else if(country.equals("RU")) {
            iFactory = new RuCarPriceFactory();
        }

        Car lada = iFactory.getCar("porsche");
        System.out.println(lada.getPrice());
    }
}
