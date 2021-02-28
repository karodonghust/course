package com.designPattern.compoundPattern.duck;

import com.designPattern.compoundPattern.observable.Observer;
import com.designPattern.compoundPattern.observable.impl.Observable;
import com.designPattern.compoundPattern.quack.Quackalbe;

public class DuckCall implements Quackalbe {
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
