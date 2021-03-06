package com.dp.compoundPattern.duck.factory;

import com.dp.compoundPattern.duck.*;
import com.dp.compoundPattern.quack.Quackalbe;

public class CountingDuckFactory extends AbstractDuckFactory{
    DuckFactory duckFactory;

    public CountingDuckFactory(DuckFactory duckFactory){
        this.duckFactory = duckFactory;
    }

    @Override
    public Quackalbe createMallardDuck() {
        return new QuackCounter(duckFactory.createMallardDuck());
    }

    @Override
    public Quackalbe createRedheadDuck() {
        return new QuackCounter(duckFactory.createRedheadDuck());
    }

    @Override
    public Quackalbe createDuckCall() {
        return new QuackCounter(duckFactory.createDuckCall());
    }

    @Override
    public Quackalbe createRubberDuck() {
        return new QuackCounter(duckFactory.createRubberDuck());
    }
}
