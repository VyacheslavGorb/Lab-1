package com.project.shape.boundedshape;

import java.awt.*;

public class Oval extends BoundedShape {
    public Oval() {
        super();
    }

    public Oval(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Oval(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(Math.min(firstPoint.x, secondPoint.x),
                Math.min(firstPoint.y, secondPoint.y),
                getWidth(),
                getHeight());
    }
}
