package com.project.form;

import com.project.shape.Line;
import com.project.shape.Shape;
import com.project.shape.ShapeContainer;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {

    private ShapeContainer shapeContainer;

    public DrawFrame() {
        shapeContainer = new ShapeContainer();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setContentPane(new DrawPanel(shapeContainer));
        this.setVisible(true);
    }


    public static void main(String[] args) {
        var frame = new DrawFrame();

    }
}
