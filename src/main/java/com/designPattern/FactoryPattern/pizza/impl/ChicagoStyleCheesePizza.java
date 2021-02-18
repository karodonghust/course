package com.designPattern.FactoryPattern.pizza.impl;

import com.designPattern.FactoryPattern.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago style deep dish cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("shredded mozzarella cheese");
    }
}
