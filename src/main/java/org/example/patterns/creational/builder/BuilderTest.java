package org.example.patterns.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Build build = new Build(2);
        Car car = build.buildCar();
    }
}
