package com.dp.templatePattern;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("brew tee");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
}
