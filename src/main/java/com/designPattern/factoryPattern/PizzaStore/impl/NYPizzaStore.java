package com.designPattern.factoryPattern.PizzaStore.impl;

import com.designPattern.factoryPattern.PizzaStore.PizzaStore;
import com.designPattern.factoryPattern.pizza.Pizza;
import com.designPattern.factoryPattern.pizza.impl.NYStyleCheesePizza;
import com.designPattern.factoryPattern.pizzaIngredientFactory.impl.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza(new NYPizzaIngredientFactory());
        } else {
            return null;
        }
    }
}
