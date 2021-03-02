package com.designPattern.builderPattern.item.coldDrink;

import com.designPattern.builderPattern.item.Item;
import com.designPattern.builderPattern.pack.Packing;
import com.designPattern.builderPattern.pack.impl.Bottle;

public abstract class ColdDrink implements Item {

    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();
}
