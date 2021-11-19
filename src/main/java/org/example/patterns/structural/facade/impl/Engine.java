package org.example.patterns.structural.facade.impl;

import org.example.patterns.structural.facade.Car;

public class Engine implements Car {
    @Override
    public void start() {
        System.out.println("Run Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }
}
