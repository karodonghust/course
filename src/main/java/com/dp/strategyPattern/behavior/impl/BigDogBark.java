package com.dp.strategyPattern.behavior.impl;

import com.dp.strategyPattern.behavior.BarkBehavior;

public class BigDogBark implements BarkBehavior {

    @Override
    public void bark() {
        System.out.println("汪汪汪...汪汪汪");
    }
}
