package com.designPattern.factoryPattern.PizzaStore.impl;

import com.designPattern.factoryPattern.PizzaStore.PizzaStore;
import com.designPattern.factoryPattern.pizza.Pizza;
import com.designPattern.factoryPattern.pizza.impl.ChicagoStyleCheesePizza;
import com.designPattern.factoryPattern.pizzaIngredientFactory.impl.ChicagoStylePizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza(new ChicagoStylePizzaIngredientFactory());
        } else {
            return null;
        }
    }
}
