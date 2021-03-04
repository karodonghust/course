package com.designPattern.strategyPattern.behavior.impl;

import com.designPattern.strategyPattern.behavior.RunBehavior;

public class SmallDogRun implements RunBehavior {

    @Override
    public void run() {
        System.out.println("咣叽...咣叽...");
    }
}
