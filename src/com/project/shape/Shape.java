package com.project.shape;

import java.awt.Point;
import java.awt.Graphics;

public abstract class Shape {
    protected Point startPoint;
    protected Point endPoint;

    public Shape() {
        startPoint = new Point();
        endPoint = new Point();
    }

    public Shape(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint);
        this.endPoint = new Point(endPoint);
    }

    public Shape(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    public boolean isShapeCoordinate(int x, int y) {
        return ((x >= startPoint.x) && (x <= endPoint.x))
                && ((y >= startPoint.y) && (y <= endPoint.y));
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public abstract void draw(Graphics graphics);
}
