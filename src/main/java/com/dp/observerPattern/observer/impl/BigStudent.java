package com.dp.observerPattern.observer.impl;

import com.dp.observerPattern.observer.Observer;

public class BigStudent implements Observer {



    @Override
    public void update(String message) {
        System.out.println("bigStudent get message:" + message);
    }
}
