package com.dp.builderPattern.item.burger;

import com.dp.builderPattern.item.Item;
import com.dp.builderPattern.pack.Packing;
import com.dp.builderPattern.pack.impl.Wrapper;

public abstract class Burger implements Item {



    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
