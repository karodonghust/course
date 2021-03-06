package com.dp.compoundPattern.duck;

import com.dp.compoundPattern.goose.Goose;
import com.dp.compoundPattern.observable.Observer;
import com.dp.compoundPattern.observable.impl.Observable;
import com.dp.compoundPattern.quack.Quackalbe;

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
