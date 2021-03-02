package com.designPattern.builderPattern.item;

import com.designPattern.builderPattern.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();

}
