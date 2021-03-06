package com.project.shape;

import java.awt.*;

public class Line extends Shape {
    int lineWidth;
    Color lineColor;

    public Line() {
    }

    public Line(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Line(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    int getX1() {
        return firstPoint.x;
    }

    int getX2() {
        return secondPoint.x;
    }

    int getY1() {
        return firstPoint.y;
    }

    int getY2() {
        return secondPoint.y;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
    }
}
