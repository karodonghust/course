package com.designPattern.factoryPattern.pizza.impl;

import com.designPattern.factoryPattern.pizza.Pizza;
import com.designPattern.factoryPattern.pizzaIngredientFactory.PizzaIngredientFactory;

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
