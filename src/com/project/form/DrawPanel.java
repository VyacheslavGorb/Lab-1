package com.project.form;

import com.project.shape.Line;
import com.project.shape.Shape;
import com.project.shape.ShapeContainer;
import com.project.shape.Text;
import com.project.shape.boundedshape.Oval;
import com.project.shape.boundedshape.Rectangle;
import com.project.shape.boundedshape.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DrawPanel extends JPanel {
    private Shape currentObject;
    private final ShapeContainer shapeContainer;
    private final ShapeType shapeType;

    public DrawPanel(ShapeContainer shapeContainer, ShapeType shapeType) {
        super();
        this.shapeContainer = shapeContainer;
        this.addMouseListener(new DrawMouseAdapter());
        this.addMouseMotionListener(new DrawMouseMotionAdapter());
        this.shapeType = shapeType;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapeContainer.getShapeList()) {
            shape.draw(g);
        }
    }

    private class DrawMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            currentObject = createChosenShape();
            currentObject.setFirstPoint(e.getPoint());
            currentObject.setSecondPoint(e.getPoint());
            shapeContainer.addShape(currentObject);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            currentObject.setSecondPoint(e.getPoint());
            repaint();
        }
    }

    private class DrawMouseMotionAdapter extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            currentObject.setSecondPoint(e.getPoint());
            repaint();
        }
    }

    private Shape createChosenShape() {
        switch (shapeType.getType()) {
            case LINE -> {
                return new Line();
            }

            case OVAL -> {
                return new Oval();
            }

            case TEXT -> {
                return new Text("Hello");
            }

            case TRIANGLE -> {
                return new Triangle();
            }

            default -> {
                return new Rectangle();
            }

        }
    }
}
