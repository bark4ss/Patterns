package org.example.patterns.creational.builder;

public class Car {
    public void buildBase() {
        System.out.println("Build base");
    }

    public void buildWheels() {
        System.out.println("Attach wheels");
    }

    public void buildEngine(Engine engine) {
        System.out.println("Attach an engine: " + engine.getEngineType());
    }
}
