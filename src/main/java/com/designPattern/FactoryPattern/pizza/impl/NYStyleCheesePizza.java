package com.designPattern.FactoryPattern.pizza.impl;

import com.designPattern.FactoryPattern.pizza.Pizza;
import com.designPattern.FactoryPattern.pizzaIngredientFactory.PizzaIngredientFactory;

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
