package com.dp.compoundPattern.duck;

import com.dp.compoundPattern.observable.Observer;
import com.dp.compoundPattern.observable.impl.Observable;
import com.dp.compoundPattern.quack.Quackalbe;

public class QuackCounter implements Quackalbe {
    Quackalbe duck;
    static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackalbe duck){
        this.duck = duck;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuacks(){
        return numberOfQuacks;
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
