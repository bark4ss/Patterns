package org.example.patterns.creational.builderExtra;

import java.time.LocalDate;

public class CarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder name(String name) {
        this.car.setName(name);
        return this;
    }

    public CarBuilder model(String model) {
        this.car.setModel(model);
        return this;
    }

    public CarBuilder brand(String brand) {
        this.car.setBrand(brand);
        return this;
    }

    public CarBuilder price(int price) {
        this.car.setPrice(price);
        return this;
    }

    public CarBuilder quality(int quality) {
        this.car.setQuality(quality);
        return this;
    }

    public CarBuilder date(LocalDate date) {
        this.car.setDate(date);
        return this;
    }

    public CarBuilder typeEngine(String typeEngine) {
        this.car.setTypeEngine(typeEngine);
        return this;
    }

    public CarBuilder leftHanded(boolean isLeftHanded) {
        this.car.setLeftHanded(isLeftHanded);
        return this;
    }

    public Car build() {
        return this.car;
    }
}
