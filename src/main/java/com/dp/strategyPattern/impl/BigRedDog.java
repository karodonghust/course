package com.dp.strategyPattern.impl;

import com.dp.strategyPattern.Dog;
import com.dp.strategyPattern.behavior.impl.BigDogBark;
import com.dp.strategyPattern.behavior.impl.BigDogRun;

public class BigRedDog extends Dog {

    public BigRedDog(String name){
        this.color = "red";
        this.name = name;
        setBarkBehavior(new BigDogBark());
        setRunBehavior(new BigDogRun());
    }

}
