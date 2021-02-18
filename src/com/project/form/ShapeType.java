package com.project.form;

public class ShapeType {

    private Shapes type;

    public ShapeType(Shapes type) {
        this.type = type;
    }

    public Shapes getType() {
        return type;
    }

    public void setType(Shapes shape) {
        this.type = shape;
    }

    private enum Shapes {
        RECTANGLE, OVAL, TRIANGLE, LINE, TEXT;
    }
}




