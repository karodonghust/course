package com.dp.prototypePattern.impl;

import com.dp.prototypePattern.Shape;

public class Rectangle extends Shape {

    public Rectangle(String type){
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("draw" + this.type);
    }
}
