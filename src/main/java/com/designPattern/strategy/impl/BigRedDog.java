package com.designPattern.strategy.impl;

import com.designPattern.strategy.Dog;
import com.designPattern.strategy.behavior.impl.BigDogBark;
import com.designPattern.strategy.behavior.impl.BigDogRun;

public class BigRedDog extends Dog {

    public BigRedDog(String name){
        this.color = "red";
        this.name = name;
        setBarkBehavior(new BigDogBark());
        setRunBehavior(new BigDogRun());
    }

}
