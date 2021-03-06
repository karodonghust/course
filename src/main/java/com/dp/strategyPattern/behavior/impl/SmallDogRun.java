package com.dp.strategyPattern.behavior.impl;

import com.dp.strategyPattern.behavior.RunBehavior;

public class SmallDogRun implements RunBehavior {

    @Override
    public void run() {
        System.out.println("咣叽...咣叽...");
    }
}
