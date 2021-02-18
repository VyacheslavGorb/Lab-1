package com.project.shape.boundedshape;

import com.project.shape.boundedshape.BoundedShape;

import java.awt.*;

public class Rectangle extends BoundedShape {
    public Rectangle() {
        super();
    }

    public Rectangle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawRect(startPoint.x, startPoint.y, getWidth(),getHeight());
    }
}
