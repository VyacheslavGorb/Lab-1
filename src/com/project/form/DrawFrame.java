package com.project.form;

import com.project.shape.ShapeContainer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        try {
            UIManager.setLookAndFeel(
                    UIManager.createLookAndFeel("Windows"));
        }
        catch (UnsupportedLookAndFeelException ignored) {
        }
        shapeContainer = new ShapeContainer();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setContentPane(mainPanel);
        setButtonActionListners();
        currentShapeType = new ShapeType(ShapeType.Shapes.RECTANGLE);
        mainPanel.add(new DrawPanel(shapeContainer, currentShapeType));
        this.setVisible(true);
    }

    private void setButtonActionListners() {
        bRect.addActionListener(createActionListener(ShapeType.Shapes.RECTANGLE));
        bLine.addActionListener(createActionListener(ShapeType.Shapes.LINE));
        bTriangle.addActionListener(createActionListener(ShapeType.Shapes.TRIANGLE));
        bOval.addActionListener(createActionListener(ShapeType.Shapes.OVAL));
    }

    private ActionListener createActionListener(ShapeType.Shapes type) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentShapeType.setType(type);
            }
        };
    }
}
