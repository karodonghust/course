package com.designPattern.compoundPattern.observable;

import com.designPattern.compoundPattern.quack.Quackalbe;

public interface Observer {
    void update(QuackObservable duck);
}
