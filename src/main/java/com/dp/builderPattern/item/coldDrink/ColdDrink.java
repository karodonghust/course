package com.dp.builderPattern.item.coldDrink;

import com.dp.builderPattern.item.Item;
import com.dp.builderPattern.pack.Packing;
import com.dp.builderPattern.pack.impl.Bottle;

public abstract class ColdDrink implements Item {

    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();
}
