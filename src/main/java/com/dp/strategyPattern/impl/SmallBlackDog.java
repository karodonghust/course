package com.dp.strategyPattern.impl;

import com.dp.strategyPattern.Dog;
import com.dp.strategyPattern.behavior.impl.SmallDogBark;
import com.dp.strategyPattern.behavior.impl.SmallDogRun;

public class SmallBlackDog extends Dog {

    public SmallBlackDog(String name) {
        this.color = "red";
        this.name = name;
        setBarkBehavior(new SmallDogBark());
        setRunBehavior(new SmallDogRun());
    }

}
