package com.designPattern.statePattern.state.impl;

import com.designPattern.statePattern.machine.GumballMachine;
import com.designPattern.statePattern.state.State;

public class SoldOutState implements State {

    public SoldOutState(GumballMachine gumballMachine) {
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
