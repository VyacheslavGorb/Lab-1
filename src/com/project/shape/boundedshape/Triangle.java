package com.project.shape.boundedshape;

import com.project.shape.boundedshape.BoundedShape;

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
        normalizeCoordinates();
        graphics.drawLine(startPoint.x, endPoint.y, startPoint.x + getWidth() / 2, startPoint.y);
        graphics.drawLine(startPoint.x + getWidth() / 2, startPoint.y, endPoint.x, endPoint.y);
        graphics.drawLine(startPoint.x, endPoint.y, endPoint.x, endPoint.y);
    }
}
