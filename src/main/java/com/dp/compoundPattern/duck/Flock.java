package com.dp.compoundPattern.duck;

import com.dp.compoundPattern.observable.Observer;
import com.dp.compoundPattern.observable.impl.Observable;
import com.dp.compoundPattern.quack.Quackalbe;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackalbe {
    ArrayList<Quackalbe> quackers = new ArrayList();
    Observable observable;

    public Flock add(Quackalbe quacker) {
        quackers.add(quacker);
        this.observable = new Observable(this);
        return this;
    }

    @Override
    public void quack() {
        Iterator<Quackalbe> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackalbe quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackalbe> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackalbe quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
