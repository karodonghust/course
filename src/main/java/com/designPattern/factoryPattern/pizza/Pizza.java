package com.designPattern.factoryPattern.pizza;

import com.designPattern.factoryPattern.pizzaIngredient.Dough;
import com.designPattern.factoryPattern.pizzaIngredient.Sauce;
import com.designPattern.factoryPattern.pizzaIngredientFactory.PizzaIngredientFactory;

import java.util.ArrayList;

public abstract class Pizza {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    protected String name;
    //面团
    protected Dough dough;
    //调料
    protected Sauce sauce;
    //佐料
    protected ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(int i=0;i<toppings.size();i++){
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("bake for pizza");
    }

    public void cut(){
        //将pizza对角切片
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("place pizza in official PizzzaStore box");
    }

    public String getName(){
        return name;
    }
}