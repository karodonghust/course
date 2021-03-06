package com.dp.factoryPattern.PizzaStore.impl;

import com.dp.factoryPattern.PizzaStore.PizzaStore;
import com.dp.factoryPattern.pizza.Pizza;
import com.dp.factoryPattern.pizza.impl.ChicagoStyleCheesePizza;
import com.dp.factoryPattern.pizzaIngredientFactory.impl.ChicagoStylePizzaIngredientFactory;

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
