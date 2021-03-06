package com.dp.statePattern.machine;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println("Gumball Machine: " + gumballMachine.location);
        System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
