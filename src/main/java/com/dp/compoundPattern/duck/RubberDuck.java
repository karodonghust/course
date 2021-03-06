package com.dp.compoundPattern.duck;

import com.dp.compoundPattern.observable.Observer;
import com.dp.compoundPattern.observable.impl.Observable;
import com.dp.compoundPattern.quack.Quackalbe;

public class RubberDuck implements Quackalbe {
    Observable observable;

    public RubberDuck(){
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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
