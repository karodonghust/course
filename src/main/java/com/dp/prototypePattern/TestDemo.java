package com.dp.prototypePattern;

import com.dp.prototypePattern.impl.Circle;

public class TestDemo {

    public static void main(String[] args) {
        ShapeCache.loadShapes();

        Circle circle = (Circle) ShapeCache.getShape("1");
        Circle circle1 = (Circle) ShapeCache.getShape("1");
        System.out.println(ShapeCache.getShape("1").hashCode());

        circle.setType("circle_");

        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle == circle1);
        System.out.println(circle.equals(circle1));

        Circle circle2 = new Circle("123");
        System.out.println(circle2.clone().hashCode());
        System.out.println(circle2.hashCode());
    }
}
