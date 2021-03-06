package com.dp.strategyPattern;

import com.dp.strategyPattern.behavior.BarkBehavior;
import com.dp.strategyPattern.behavior.RunBehavior;
import com.dp.strategyPattern.comparable.HaveWeight;

public abstract class Dog implements HaveWeight {
    public String name;
    public String color;
    private BarkBehavior barkBehavior;
    private RunBehavior runBehavior;


    public void bark() {
        barkBehavior.bark();
    }

    public void run() {
        runBehavior.run();
    }

    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void setRunBehavior(RunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
