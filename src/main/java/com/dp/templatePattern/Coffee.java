package com.dp.templatePattern;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("brew coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("add milk");
    }
}
