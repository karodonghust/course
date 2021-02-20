package com.designPattern.FactoryPattern.PizzaStore.impl;

import com.designPattern.FactoryPattern.PizzaStore.PizzaStore;
import com.designPattern.FactoryPattern.pizza.Pizza;
import com.designPattern.FactoryPattern.pizza.impl.NYStyleCheesePizza;
import com.designPattern.FactoryPattern.pizzaIngredientFactory.impl.NYPizzaIngredientFactory;

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
