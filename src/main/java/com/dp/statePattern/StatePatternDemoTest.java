package com.dp.statePattern;

import com.dp.statePattern.machine.GumballMachine;
import com.dp.statePattern.machine.GumballMonitor;

public class StatePatternDemoTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine("school",5);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();

        System.out.println(gumballMachine);
        gumballMonitor.report();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMonitor.report();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMonitor.report();
    }
}
