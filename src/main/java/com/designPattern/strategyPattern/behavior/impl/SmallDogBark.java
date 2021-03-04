package com.designPattern.strategyPattern.behavior.impl;

import com.designPattern.strategyPattern.behavior.BarkBehavior;

public class SmallDogBark implements BarkBehavior {


    @Override
    public void bark() {
        System.out.println("哇唔...哇唔...");
    }
}
