package com.designPattern.compoundPattern.duck.factory;

import com.designPattern.compoundPattern.duck.DuckCall;
import com.designPattern.compoundPattern.duck.MallardDuck;
import com.designPattern.compoundPattern.duck.RubberDuck;
import com.designPattern.compoundPattern.quack.Quackalbe;

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
