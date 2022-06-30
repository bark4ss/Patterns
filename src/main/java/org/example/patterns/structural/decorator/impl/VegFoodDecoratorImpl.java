package org.example.patterns.structural.decorator.impl;

import org.example.patterns.structural.decorator.Food;
import org.example.patterns.structural.decorator.FoodDecorator;

public class VegFoodDecoratorImpl extends FoodDecorator {

    public VegFoodDecoratorImpl(Food food) {
        super(food);
    }

    @Override
    public String getFoodName() {
        return super.getFoodName() + "Veg Delicious";
    }

    @Override
    public int getFoodPrice() {
        return super.getFoodPrice() + 150;
    }
}
