package com.project.shape.boundedshape;

import java.awt.*;

public class Triangle extends BoundedShape {
    public Triangle() {
        super();
    }

    public Triangle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Triangle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void draw(Graphics graphics) {
        int x1 = Math.min(firstPoint.x, secondPoint.x);
        int x2 = Math.max(firstPoint.x, secondPoint.x);
        int y1 = Math.min(firstPoint.y, secondPoint.y);
        int y2 = Math.max(firstPoint.y, secondPoint.y);

        graphics.drawLine(x1, y2, x1 + getWidth() / 2, y1);
        graphics.drawLine(x1 + getWidth() / 2, y1, x2, y2);
        graphics.drawLine(x1, y2, x2, y2);
    }
}
