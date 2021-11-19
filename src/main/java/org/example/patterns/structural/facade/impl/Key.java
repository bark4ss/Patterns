package org.example.patterns.structural.facade.impl;

import org.example.patterns.structural.facade.Car;

public class Key implements Car {
    @Override
    public void start() {
        System.out.println("Insert key");
    }

    @Override
    public void stop() {
        System.out.println("Detach key");
    }
}
