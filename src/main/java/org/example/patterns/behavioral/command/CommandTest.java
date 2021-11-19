package org.example.patterns.behavioral.command;

import org.example.patterns.behavioral.command.impl.StartCar;
import org.example.patterns.behavioral.command.impl.StopCar;

public class CommandTest {
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);
        CarInvoker carInvoker = new CarInvoker(stopCar);
        carInvoker.execute();
    }
}
