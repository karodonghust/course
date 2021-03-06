package com.dp.factoryPattern.PizzaStore.impl;

import com.dp.factoryPattern.PizzaStore.PizzaStore;
import com.dp.factoryPattern.pizza.Pizza;
import com.dp.factoryPattern.pizza.impl.NYStyleCheesePizza;
import com.dp.factoryPattern.pizzaIngredientFactory.impl.NYPizzaIngredientFactory;

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
