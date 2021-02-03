package com.designPattern.strategy.behavior.impl;

import com.designPattern.strategy.behavior.RunBehavior;

public class SmallDogRun implements RunBehavior {

    @Override
    public void run() {
        System.out.println("咣叽...咣叽...");
    }
}
