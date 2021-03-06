package com.dp.compoundPattern.duck.factory;

import com.dp.compoundPattern.duck.DuckCall;
import com.dp.compoundPattern.duck.MallardDuck;
import com.dp.compoundPattern.duck.RubberDuck;
import com.dp.compoundPattern.quack.Quackalbe;

public class DuckFactory extends AbstractDuckFactory{


    @Override
    public Quackalbe createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackalbe createRedheadDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackalbe createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackalbe createRubberDuck() {
        return new RubberDuck();
    }
}
