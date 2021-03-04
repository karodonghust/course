package com.designPattern.strategyPattern.impl;

import com.designPattern.strategyPattern.Dog;
import com.designPattern.strategyPattern.behavior.impl.BigDogBark;
import com.designPattern.strategyPattern.behavior.impl.BigDogRun;

import java.util.Comparator;

public class BigRedDog extends Dog {

    public BigRedDog(String name){
        this.color = "red";
        this.name = name;
        setBarkBehavior(new BigDogBark());
        setRunBehavior(new BigDogRun());
    }

}
