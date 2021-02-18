package com.designPattern.FactoryPattern.PizzaStore.impl;

import com.designPattern.FactoryPattern.PizzaStore.PizzaStore;
import com.designPattern.FactoryPattern.pizza.Pizza;
import com.designPattern.FactoryPattern.pizza.impl.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
