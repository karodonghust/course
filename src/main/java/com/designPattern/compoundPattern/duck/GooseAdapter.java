package com.designPattern.compoundPattern.duck;

import com.designPattern.compoundPattern.goose.Goose;
import com.designPattern.compoundPattern.quack.Quackalbe;

public class GooseAdapter implements Quackalbe {
    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
