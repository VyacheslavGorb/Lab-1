package com.project.shape;

import java.awt.*;

public class Text extends Shape {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public Text(Point startPoint, Point endPoint, String text) {
        super(startPoint, endPoint);
        this.text = text;
    }

    public Text(int x1, int y1, int x2, int y2, String text) {
        super(x1, y1, x2, y2);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawString(text, startPoint.x, endPoint.y);
    }
}
