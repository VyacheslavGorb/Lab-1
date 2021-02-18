package com.project.shape;

import java.awt.*;

public class Line extends Shape {
    int lineWidth;
    Color lineColor;

    int getX1() {
        return startPoint.x;
    }

    int getX2() {
        return endPoint.x;
    }

    int getY1() {
        return startPoint.y;
    }

    int getY2() {
        return endPoint.y;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
    }
}
