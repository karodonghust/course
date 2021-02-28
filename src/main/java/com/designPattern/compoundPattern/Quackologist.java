package com.designPattern.compoundPattern;

import com.designPattern.compoundPattern.observable.Observer;
import com.designPattern.compoundPattern.observable.QuackObservable;

public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
