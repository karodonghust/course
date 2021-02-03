package com.designPattern.strategy.behavior.impl;

import com.designPattern.strategy.behavior.BarkBehavior;

public class BigDogBark implements BarkBehavior {

    @Override
    public void bark() {
        System.out.println("汪汪汪...汪汪汪");
    }
}
