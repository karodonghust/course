package com.dp.adapterPattern;

import com.dp.adapterPattern.adapter.TurkeyAdapter;
import com.dp.adapterPattern.duck.Duck;
import com.dp.adapterPattern.duck.impl.MallardDuck;
import com.dp.adapterPattern.turkey.Turkey;
import com.dp.adapterPattern.turkey.impl.WildTurkey;

public class AdapterTestDemo {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        System.out.println("this is a mallardDuck");
        duck.fly();
        duck.quack();

        System.out.println("this is a wildTurkey");
        turkey.fly();
        turkey.gobble();

        System.out.println("this is a turkeyAdapter");
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
