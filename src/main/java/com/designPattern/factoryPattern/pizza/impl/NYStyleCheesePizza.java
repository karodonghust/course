package com.designPattern.factoryPattern.pizza.impl;

import com.designPattern.factoryPattern.pizza.Pizza;
import com.designPattern.factoryPattern.pizzaIngredientFactory.PizzaIngredientFactory;

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
