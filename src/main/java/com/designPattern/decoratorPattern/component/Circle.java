package com.designPattern.decoratorPattern.component;

import com.designPattern.decoratorPattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: Circle");
    }
}
