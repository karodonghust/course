package com.dp.bridgePattern.impl;

import com.dp.bridgePattern.DrawAPI;
import com.dp.bridgePattern.Shape;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
