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

        Name name1 = new Name();
        name1.nameStr = "5";

        Name name2 = new Name();
        name2.nameStr = "6";
        Circle circle2 = new Circle("6");
        circle2.setA(name1);
        circle2.setB(5);

        Circle circle3 = (Circle) circle2.clone();

        circle3.getA().nameStr = "6";
        circle3.setB(6);
        System.out.println(circle2);
        System.out.println(circle3);
    }
}
