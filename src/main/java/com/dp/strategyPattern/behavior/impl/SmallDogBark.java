package com.dp.strategyPattern.behavior.impl;

import com.dp.strategyPattern.behavior.BarkBehavior;

public class SmallDogBark implements BarkBehavior {


    @Override
    public void bark() {
        System.out.println("哇唔...哇唔...");
    }
}
