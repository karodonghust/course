package com.dp.strategyPattern;

import com.dp.strategyPattern.comparable.WeightComparator;
import com.dp.strategyPattern.impl.BigRedDog;
import com.dp.strategyPattern.impl.SmallBlackDog;

import java.util.Comparator;

public class DogGame {

    public static void main(String[] args) {
        Comparator<Dog> comparator = new WeightComparator<>();
        Dog littleBlack = new SmallBlackDog("littleBlack");
        Dog bigRed = new BigRedDog("bigRed");

        System.out.println("小狗跑：");
        littleBlack.run();
        System.out.println("小狗叫：");
        littleBlack.bark();

        System.out.println("大狗跑：");
        bigRed.run();
        System.out.println("大狗叫：");
        bigRed.bark();

        System.out.println(bigRed);
        System.out.println(littleBlack);

        Dog[] dogs = {};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return 0;
            }
        });
    }
}
