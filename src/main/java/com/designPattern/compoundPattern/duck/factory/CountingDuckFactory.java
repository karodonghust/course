package com.designPattern.compoundPattern.duck.factory;

import com.designPattern.compoundPattern.duck.*;
import com.designPattern.compoundPattern.quack.Quackalbe;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackalbe createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackalbe createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackalbe createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackalbe createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
