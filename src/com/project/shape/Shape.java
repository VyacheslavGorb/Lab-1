package com.project.shape;

import java.awt.Point;
import java.awt.Graphics;

public abstract class Shape {
    protected Point firstPoint;
    protected Point secondPoint;

    public Shape() {
        firstPoint = new Point();
        secondPoint = new Point();
    }

    public Shape(Point firstPoint, Point secondPoint) {
        this.firstPoint = new Point(firstPoint);
        this.secondPoint = new Point(secondPoint);
    }

    public Shape(int x1, int y1, int x2, int y2) {
        this.firstPoint = new Point(x1, y1);
        this.secondPoint = new Point(x2, y2);
    }

    public boolean isShapeCoordinate(int x, int y) {
        return ((x >= firstPoint.x) && (x <= secondPoint.x))
                && ((y >= firstPoint.y) && (y <= secondPoint.y));
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public abstract void draw(Graphics graphics);
}
