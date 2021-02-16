package com.designPattern.decoratorPattern;

import com.designPattern.decoratorPattern.component.Circle;
import com.designPattern.decoratorPattern.component.Rectangle;
import com.designPattern.decoratorPattern.decorator.RedShapeDecorator;
import com.designPattern.decoratorPattern.decorator.ShapeDecorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
