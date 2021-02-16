package com.designPattern.decoratorPattern.component;

import com.designPattern.decoratorPattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
