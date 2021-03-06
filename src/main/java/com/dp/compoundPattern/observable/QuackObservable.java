package com.dp.compoundPattern.observable;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
