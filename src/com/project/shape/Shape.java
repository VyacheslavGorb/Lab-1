package com.project.shape;

import java.awt.Point;
import java.awt.Graphics;

public abstract class Shape {
    protected Point startPoint;
    protected Point endPoint;

    Shape() {
        startPoint = new Point();
        endPoint = new Point();
    }

    Shape(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint);
        this.endPoint = new Point(endPoint);
    }

    Shape(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    public abstract void draw(Graphics graphics);
}