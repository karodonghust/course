package com.designPattern.strategy;

import com.designPattern.strategy.impl.BigRedDog;
import com.designPattern.strategy.impl.SmallBlackDog;

public class DogGame {

    public static void main(String[] args) {
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
    }
}
