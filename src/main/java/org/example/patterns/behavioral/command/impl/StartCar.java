package org.example.patterns.behavioral.command.impl;

import org.example.patterns.behavioral.command.Car;
import org.example.patterns.behavioral.command.Command;

public class StartCar implements Command {

    private Car car;

    public StartCar(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.startEngine();
    }
}
