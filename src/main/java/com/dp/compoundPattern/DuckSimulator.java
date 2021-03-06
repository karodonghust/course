package com.dp.compoundPattern;

import com.dp.compoundPattern.duck.*;
import com.dp.compoundPattern.duck.factory.CountingDuckFactory;
import com.dp.compoundPattern.duck.factory.DuckFactory;
import com.dp.compoundPattern.goose.Goose;
import com.dp.compoundPattern.quack.Quackalbe;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory(new DuckFactory());
        Quackalbe mallardDuck = countingDuckFactory.createMallardDuck();
        Quackalbe redheadDuck = countingDuckFactory.createRedheadDuck();
        Quackalbe duckCall = countingDuckFactory.createDuckCall();
        Quackalbe rubberDuck = countingDuckFactory.createRubberDuck();
        Quackalbe gooseAdapter = new QuackCounter(new GooseAdapter(new Goose()));

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck).add(redheadDuck).add(duckCall).add(rubberDuck).add(gooseAdapter);
        System.out.println("\nDuck simulator");

        Flock flockOfMallards = new Flock();

        Quackalbe mallardDuckOne = countingDuckFactory.createMallardDuck();
        Quackalbe mallardDuckTwo = countingDuckFactory.createMallardDuck();
        Quackalbe mallardDuckThree = countingDuckFactory.createMallardDuck();
        Quackalbe mallardDuckFour = countingDuckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuckOne).add(mallardDuckTwo).add(mallardDuckThree).add(mallardDuckFour);
        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);


        simulate(flockOfDucks);
        System.out.println(QuackCounter.getQuacks());
    }

    void simulate(Quackalbe duck){
        duck.quack();
    }
}
