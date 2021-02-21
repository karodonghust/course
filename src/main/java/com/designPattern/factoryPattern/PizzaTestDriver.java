package com.designPattern.factoryPattern;

import com.designPattern.factoryPattern.PizzaStore.PizzaStore;
import com.designPattern.factoryPattern.PizzaStore.impl.ChicagoStylePizzaStore;
import com.designPattern.factoryPattern.PizzaStore.impl.NYPizzaStore;
import com.designPattern.factoryPattern.pizza.Pizza;

public class PizzaTestDriver {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("order a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");

        System.out.println("order a " + pizza.getName() + "\n");
    }
}
