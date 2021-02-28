package com.designPattern.compoundPattern.duck;

import com.designPattern.compoundPattern.quack.Quackalbe;

public class RedheadDuck implements Quackalbe {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
