package com.project.form;

import com.project.shape.Line;
import com.project.shape.Shape;
import com.project.shape.ShapeContainer;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {

    private ShapeContainer shapeContainer;
    private JPanel mainPanel;
    private JPanel buttons;
    private JButton bRect;
    private JButton bLine;
    private JButton bTriangle;
    private JButton bOval;
    private ShapeType currentShapeType;

    public DrawFrame() {
        shapeContainer = new ShapeContainer();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setContentPane(mainPanel);
        mainPanel.add(new DrawPanel(shapeContainer));
        this.setVisible(true);
//        currentShapeType = ShapeType.RECTANGLE;
    }


    public static void main(String[] args) {
        var frame = new DrawFrame();
    }
}
