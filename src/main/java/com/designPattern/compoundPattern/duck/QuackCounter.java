package com.designPattern.compoundPattern.duck;

import com.designPattern.compoundPattern.quack.Quackalbe;

public class QuackCounter implements Quackalbe {
    Quackalbe duck;
    static int numberOfQuacks;

    public QuackCounter(Quackalbe duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }
}
