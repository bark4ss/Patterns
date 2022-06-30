package org.example.patterns.structural.decorator;

public abstract class FoodDecorator implements Food {

    private Food food;

    protected FoodDecorator(Food food){
        this.food = food;
    }

    @Override
    public String getFoodName() {
        return food.getFoodName();
    }

    @Override
    public int getFoodPrice() {
        return food.getFoodPrice();
    }
}
