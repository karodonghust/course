package com.dp.decoratorPattern.component;

import com.dp.decoratorPattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
