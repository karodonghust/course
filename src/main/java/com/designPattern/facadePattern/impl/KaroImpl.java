package com.designPattern.facadePattern.impl;

import com.designPattern.facadePattern.Karo;

public class KaroImpl implements Karo {
    @Override
    public void born() {
        System.out.println("出生。。。");
    }

    @Override
    public void eat() {
        System.out.println("吃饭。。。");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉。。。");
    }

    @Override
    public void die() {
        System.out.println("死亡。。。");
    }
}
