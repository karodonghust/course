package com.designPattern.builderPattern.item.burger;

import com.designPattern.builderPattern.item.Item;
import com.designPattern.builderPattern.pack.Packing;
import com.designPattern.builderPattern.pack.impl.Wrapper;

public abstract class Burger implements Item {



    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
