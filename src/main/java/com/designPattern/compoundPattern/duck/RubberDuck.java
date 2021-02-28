package com.designPattern.compoundPattern.duck;

import com.designPattern.compoundPattern.quack.Quackalbe;

public class RubberDuck implements Quackalbe {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
