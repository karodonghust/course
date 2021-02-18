package com.designPattern.FactoryPattern;

import com.designPattern.FactoryPattern.PizzaStore.PizzaStore;
import com.designPattern.FactoryPattern.PizzaStore.impl.ChicagoStylePizzaStore;
import com.designPattern.FactoryPattern.PizzaStore.impl.NYPizzaStore;
import com.designPattern.FactoryPattern.pizza.Pizza;

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
