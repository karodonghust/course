package com.designPattern.observerPattern.subject.impl;

import com.designPattern.observerPattern.observer.Observer;
import com.designPattern.observerPattern.subject.Subject;

import java.util.ArrayList;
import java.util.List;


public class Teacher implements Subject<Observer> {

    private String message;

    private List<Observer> observers;

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }

    public Teacher(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer object) {
        if(null == observers){
            throw new NullPointerException("observers is null");
        } else {
            observers.add(object);
        }

    }

    @Override
    public void removeObserver(Observer object) {
        if(null == observers){
            observers = new ArrayList<>();
        }
        observers.remove(object);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> {
            observer.update(message);
        });
    }
}
