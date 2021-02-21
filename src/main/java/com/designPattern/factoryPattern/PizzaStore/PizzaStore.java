package com.designPattern.factoryPattern.PizzaStore;

import com.designPattern.factoryPattern.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String item){
        Pizza pizza;
        pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String item);
}
