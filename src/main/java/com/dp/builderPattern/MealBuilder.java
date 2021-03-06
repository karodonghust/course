package com.dp.builderPattern;

import com.dp.builderPattern.item.burger.ChickenBurger;
import com.dp.builderPattern.item.burger.VegBurger;
import com.dp.builderPattern.item.coldDrink.Coke;
import com.dp.builderPattern.item.coldDrink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
