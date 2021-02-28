package com.designPattern.compoundPattern.observable;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
