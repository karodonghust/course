package com.designPattern.strategyPattern.impl;

import com.designPattern.strategyPattern.Dog;
import com.designPattern.strategyPattern.behavior.impl.SmallDogBark;
import com.designPattern.strategyPattern.behavior.impl.SmallDogRun;

import java.util.Comparator;

public class SmallBlackDog extends Dog {

    public SmallBlackDog(String name, Comparator comparator) {
        super(comparator);
        this.color = "red";
        this.name = name;
        setBarkBehavior(new SmallDogBark());
        setRunBehavior(new SmallDogRun());
    }

}
