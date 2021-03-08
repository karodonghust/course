package com.dp.prototypePattern;

import com.dp.prototypePattern.impl.Circle;
import com.dp.prototypePattern.impl.Rectangle;
import com.dp.prototypePattern.impl.Square;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeTable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape shape = shapeTable.get(shapeId);
        System.out.println(shape.hashCode());
        return (Shape) shape.clone();
    }

    public static void loadShapes() {
        Circle circle = new Circle("circle");
        circle.setId("1");
        shapeTable.put(circle.getId(), circle);

        Square square = new Square("square");
        square.setId("2");
        shapeTable.put(square.getId(), square);

        Rectangle rectangle = new Rectangle("rectangle");
        rectangle.setId("3");
        shapeTable.put(rectangle.getId(), rectangle);
    }
}
