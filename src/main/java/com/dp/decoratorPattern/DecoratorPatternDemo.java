package com.dp.decoratorPattern;

import com.dp.decoratorPattern.component.Circle;
import com.dp.decoratorPattern.component.Rectangle;
import com.dp.decoratorPattern.decorator.RedShapeDecorator;
import com.dp.decoratorPattern.decorator.ShapeDecorator;

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
