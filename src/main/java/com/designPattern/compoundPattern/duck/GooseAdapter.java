package com.designPattern.compoundPattern.duck;

import com.designPattern.compoundPattern.goose.Goose;
import com.designPattern.compoundPattern.observable.Observer;
import com.designPattern.compoundPattern.observable.impl.Observable;
import com.designPattern.compoundPattern.quack.Quackalbe;

public class GooseAdapter implements Quackalbe {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose){
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
