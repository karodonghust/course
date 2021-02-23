package com.designPattern.templatePattern;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    //调味品
    abstract void addCondiments();

    void boilWater(){
        System.out.println("the water boiling");
    }

    void pourInCup(){
        System.out.println("pour the water to cup");
    }
}
