package com.designPattern.builderPattern.pack.impl;

import com.designPattern.builderPattern.pack.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
