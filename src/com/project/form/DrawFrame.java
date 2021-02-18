package com.project.form;

import com.project.shape.Line;
import com.project.shape.Shape;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    public static void main(String[] args) {
        var frame = new DrawFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setContentPane(new DrawPanel());
        frame.setVisible(true);
    }
}
