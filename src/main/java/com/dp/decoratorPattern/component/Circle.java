package com.dp.decoratorPattern.component;

import com.dp.decoratorPattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: Circle");
    }
}
