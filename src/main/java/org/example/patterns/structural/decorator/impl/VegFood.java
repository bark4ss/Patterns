package org.example.patterns.structural.decorator.impl;

import org.example.patterns.structural.decorator.Food;

public class VegFood implements Food {
    @Override
    public String getFoodName() {
        return "Veg Food";
    }

    @Override
    public int getFoodPrice() {
        return 50;
    }
}
