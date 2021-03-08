package com.dp.prototypePattern.impl;

import com.dp.prototypePattern.Shape;

public class Circle extends Shape {

    public Circle(String type) {
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("draw " + this.type);
    }


}
