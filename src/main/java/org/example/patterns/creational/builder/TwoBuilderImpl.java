package org.example.patterns.creational.builder;

public class TwoBuilderImpl extends Builder{

    public TwoBuilderImpl() {
        car = new Car();
    }
    @Override
    public Car buildCar() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new OneEngine();
        car.buildEngine(engine);
        engine = new SecondEngine();
        car.buildEngine(engine);
        return car;
    }
}
