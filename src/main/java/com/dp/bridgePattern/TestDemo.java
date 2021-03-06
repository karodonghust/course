package com.dp.bridgePattern;

import com.dp.bridgePattern.impl.Circle;
import com.dp.bridgePattern.impl.GreenCircle;
import com.dp.bridgePattern.impl.RedCircle;

public class TestDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle( new RedCircle(),100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(),100, 100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
