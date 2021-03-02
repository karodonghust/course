package com.designPattern.builderPattern.item.burger;

public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
