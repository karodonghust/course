package com.dp.observerPattern.observer.impl;

import com.dp.observerPattern.observer.Observer;

public class SmallStudent implements Observer {


    @Override
    public void update(String message) {
        System.out.println("smallStudent get message:" + message);
    }
}
