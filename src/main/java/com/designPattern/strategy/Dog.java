package com.designPattern.strategy;

import com.designPattern.strategy.behavior.BarkBehavior;
import com.designPattern.strategy.behavior.RunBehavior;

public abstract class Dog implements Comparable<Dog> {
    public String name;
    public String color;
    private BarkBehavior barkBehavior;
    private RunBehavior runBehavior;
    Comparable<Dog> comparable;

    public Dog(Comparable<Dog> comparable) {
        this.comparable = comparable;
    }

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
    public int compareTo(Dog o) {
        return comparable.compareTo(o);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
