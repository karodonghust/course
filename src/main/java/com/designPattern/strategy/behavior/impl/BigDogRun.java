package com.designPattern.strategy.behavior.impl;

import com.designPattern.strategy.behavior.RunBehavior;

public class BigDogRun implements RunBehavior {

    @Override
    public void run() {
        System.out.println("唰...唰...唰...");
    }
}
