package org.example.patterns.structural.decorator;

import org.example.patterns.structural.decorator.impl.VegFood;
import org.example.patterns.structural.decorator.impl.VegFoodDecoratorImpl;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        FoodDecorator decorator = new VegFoodDecoratorImpl(new VegFood());
        System.out.println(decorator.getFoodName());
        System.out.println(decorator.getFoodPrice());
    }
}
