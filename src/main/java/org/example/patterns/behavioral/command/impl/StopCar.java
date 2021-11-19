package org.example.patterns.behavioral.command.impl;

import org.example.patterns.behavioral.command.Car;
import org.example.patterns.behavioral.command.Command;

public class StopCar implements Command {

    private Car car;

    public StopCar(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.stopEngine();
    }
}
