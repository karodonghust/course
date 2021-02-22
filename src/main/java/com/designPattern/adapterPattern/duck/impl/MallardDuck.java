package com.designPattern.adapterPattern.duck.impl;

import com.designPattern.adapterPattern.duck.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying");
    }
}
