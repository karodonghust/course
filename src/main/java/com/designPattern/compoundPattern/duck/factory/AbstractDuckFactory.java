package com.designPattern.compoundPattern.duck.factory;

import com.designPattern.compoundPattern.quack.Quackalbe;

public abstract class AbstractDuckFactory {

    public abstract Quackalbe createMallardDuck();
    public abstract Quackalbe createRedheadDuck();
    public abstract Quackalbe createDuckCall();
    public abstract Quackalbe createRubberDuck();
}
