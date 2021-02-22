package com.designPattern.adapterPattern.adapter;

import com.designPattern.adapterPattern.duck.Duck;
import com.designPattern.adapterPattern.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
        turkey.fly();
        turkey.fly();
    }
}
