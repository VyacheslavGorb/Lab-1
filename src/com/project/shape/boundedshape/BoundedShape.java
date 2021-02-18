package com.project.shape.boundedshape;

import com.project.shape.Shape;

import java.awt.*;

public abstract class BoundedShape extends Shape {
    protected int borderWidth;
    protected Color borderColor;
    protected boolean isFilled;
    protected Color fillColor;

    public BoundedShape() {
        super();
        initColors();
    }

    public BoundedShape(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
        initColors();
    }

    public BoundedShape(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        initColors();
    }

    private void initColors() {
        borderWidth = 3;
        borderColor = Color.BLACK;
        isFilled = false;
        fillColor = Color.WHITE;
    }

    @Override
    public boolean isShapeCoordinate(int x, int y) {
        int x1 = Math.min(firstPoint.x, secondPoint.x);
        int x2 = Math.max(firstPoint.x, secondPoint.x);
        int y1 = Math.min(firstPoint.y, secondPoint.y);
        int y2 = Math.max(firstPoint.y, secondPoint.y);

        return ((x >= x1) && (x <= x2))
                && ((y >= y1) && (y <= y2));
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public int getHeight() {
        return Math.abs(secondPoint.y - firstPoint.y);
    }

    public int getWidth() {
        return Math.abs(secondPoint.x - firstPoint.x);
    }

    public int getX() {
        return firstPoint.x;
    }

    public int getY() {
        return firstPoint.y;
    }
}
