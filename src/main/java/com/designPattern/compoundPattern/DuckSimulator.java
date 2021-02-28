package com.designPattern.compoundPattern;

import com.designPattern.compoundPattern.duck.*;
import com.designPattern.compoundPattern.goose.Goose;
import com.designPattern.compoundPattern.quack.Quackalbe;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }






    void simulate(){
        Quackalbe mallardDuck = new QuackCounter(new MallardDuck());
        Quackalbe redheadDuck = new QuackCounter(new RedheadDuck());
        Quackalbe duckCall = new QuackCounter(new DuckCall());
        Quackalbe rubberDuck = new QuackCounter(new RubberDuck());
        Quackalbe gooseAdapter = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("\nDuck simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);
        System.out.println(QuackCounter.getQuacks());
    }

    void simulate(Quackalbe duck){
        duck.quack();
    }
}
