package com.dp.strategyPattern.behavior.impl;

import com.dp.strategyPattern.behavior.RunBehavior;

public class BigDogRun implements RunBehavior {

    @Override
    public void run() {
        System.out.println("唰...唰...唰...");
    }
}
