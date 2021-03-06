package com.dp.builderPattern.item;

import com.dp.builderPattern.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();

}
