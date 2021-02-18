package com.designPattern.FactoryPattern.pizza.impl;

import com.designPattern.FactoryPattern.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
