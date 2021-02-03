package com.designPattern.strategy.behavior.impl;

import com.designPattern.strategy.behavior.BarkBehavior;

public class SmallDogBark implements BarkBehavior {


    @Override
    public void bark() {
        System.out.println("哇唔...哇唔...");
    }
}
