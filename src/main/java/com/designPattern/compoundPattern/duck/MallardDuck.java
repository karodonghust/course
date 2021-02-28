package com.designPattern.compoundPattern.duck;

import com.designPattern.compoundPattern.quack.Quackalbe;

public class MallardDuck implements Quackalbe {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
