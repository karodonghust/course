package com.designPattern.strategy.impl;

import com.designPattern.strategy.Dog;
import com.designPattern.strategy.behavior.impl.SmallDogBark;
import com.designPattern.strategy.behavior.impl.SmallDogRun;

public class SmallBlackDog extends Dog {

    public SmallBlackDog(String name) {
        this.color = "red";
        this.name = name;
        setBarkBehavior(new SmallDogBark());
        setRunBehavior(new SmallDogRun());
    }

}
