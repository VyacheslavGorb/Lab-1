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
        return endPoint.y - startPoint.y;
    }

    public int getWidth() {
        return endPoint.x - startPoint.x;
    }

    public int getX() {
        return startPoint.x;
    }

    public int getY() {
        return startPoint.y;
    }

    protected void normalizeСoordinates() {
        if (startPoint.x > endPoint.x) {
            int temp = startPoint.x;
            startPoint.x = endPoint.x;
            endPoint.x = temp;
        }
        if (startPoint.y > endPoint.y) {
            int temp = startPoint.y;
            startPoint.y = endPoint.y;
            endPoint.y = temp;
        }
    }
}
