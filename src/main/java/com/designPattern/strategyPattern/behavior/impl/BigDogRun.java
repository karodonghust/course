package com.designPattern.strategyPattern.behavior.impl;

import com.designPattern.strategyPattern.behavior.RunBehavior;

public class BigDogRun implements RunBehavior {

    @Override
    public void run() {
        System.out.println("唰...唰...唰...");
    }
}
