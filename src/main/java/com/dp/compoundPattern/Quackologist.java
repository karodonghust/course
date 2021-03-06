package com.dp.compoundPattern;

import com.dp.compoundPattern.observable.Observer;
import com.dp.compoundPattern.observable.QuackObservable;

public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
