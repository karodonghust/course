package com.dp.prototypePattern.impl;

import com.dp.prototypePattern.Name;
import com.dp.prototypePattern.Shape;

public class Circle extends Shape {

    public Name a;
    public int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Name getA() {
        return a;
    }

    public void setA(Name a) {
        this.a = a;
    }

    public Circle(String type) {
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("draw " + this.type);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
