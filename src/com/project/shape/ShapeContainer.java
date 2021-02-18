package com.project.shape;

import java.util.LinkedList;
import java.util.List;

public class ShapeContainer {
    private final List<Shape> shapeList;

    public ShapeContainer() {
        shapeList = new LinkedList<Shape>();
    }

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public void deleteShape(Shape shape) {
        shapeList.remove(shape);
    }
}
