package com.designPattern.strategy;

import com.designPattern.strategy.behavior.BarkBehavior;
import com.designPattern.strategy.behavior.RunBehavior;

public abstract class Dog {
    public String name;
    public String color;
    private BarkBehavior barkBehavior;
    private RunBehavior runBehavior;

    public void bark(){
        barkBehavior.bark();
    }

    public void run(){
        runBehavior.run();
    }

    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void setRunBehavior(RunBehavior runBehavior){
        this.runBehavior = runBehavior;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
