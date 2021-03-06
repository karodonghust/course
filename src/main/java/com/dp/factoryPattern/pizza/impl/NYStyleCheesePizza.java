package com.dp.factoryPattern.pizza.impl;

import com.dp.factoryPattern.pizza.Pizza;
import com.dp.factoryPattern.pizzaIngredientFactory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "NY Style Sauce and Cheese pizza";
    }

    @Override
    public void prepare() {
       this.sauce = pizzaIngredientFactory.createSauce();
       this.dough = pizzaIngredientFactory.createDough();
       super.prepare();
    }
}
