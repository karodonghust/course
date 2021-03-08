package com.dp.prototypePattern.impl;

import com.dp.prototypePattern.Shape;

public class Square extends Shape {

    public Square(String type){
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("draw " + this.type);
    }
}
