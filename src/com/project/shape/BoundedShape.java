package com.project.shape;

import java.awt.*;

public abstract class BoundedShape extends Shape {
    private int borderWidth;
    private Color borderColor;
    private boolean isFilled;
    private Color fillColor;

    public BoundedShape() {
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

    private void initColors(){
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

    public int getHeight(){
        return startPoint.y - endPoint.y;
    }

    public int getWidth(){
        return startPoint.x - endPoint.x;
    }

    public int getX(){
        return startPoint.x;
    }

    public int getY(){
        return startPoint.y;
    }
}
