package com.dp.compoundPattern.duck.factory;

import com.dp.compoundPattern.quack.Quackalbe;

public abstract class AbstractDuckFactory {

    public abstract Quackalbe createMallardDuck();
    public abstract Quackalbe createRedheadDuck();
    public abstract Quackalbe createDuckCall();
    public abstract Quackalbe createRubberDuck();
}
