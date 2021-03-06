package com.dp.factoryPattern;

import com.dp.factoryPattern.PizzaStore.PizzaStore;
import com.dp.factoryPattern.PizzaStore.impl.ChicagoStylePizzaStore;
import com.dp.factoryPattern.PizzaStore.impl.NYPizzaStore;
import com.dp.factoryPattern.pizza.Pizza;

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
