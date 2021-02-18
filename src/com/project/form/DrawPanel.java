package com.project.form;

import com.project.shape.Shape;
import com.project.shape.boundedshape.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {
    private Shape currentObject;

    public DrawPanel() {
        super();
        this.addMouseListener(new DrawMouseAdapter());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentObject != null) {
            currentObject.draw(g);
        }
    }


    private class DrawMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            currentObject = new Rectangle();
            currentObject.setStartPoint(new Point(e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            currentObject.setEndPoint(new Point(e.getX(), e.getY()));
            repaint();
        }
    }
}
