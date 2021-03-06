package com.dp.factoryPattern.pizza.impl;

import com.dp.factoryPattern.pizza.Pizza;
import com.dp.factoryPattern.pizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Chicago style deep dish cheese pizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        super.prepare();
    }
}
