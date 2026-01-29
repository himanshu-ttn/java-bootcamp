package com.tothenew.intro_to_java_2.ques4;

public class ShapeFactory {

    // Factory Method
    public static Shape getShape(MyShape shapeType) {

        if (shapeType == null) {
            return null;
        }

        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
        }

        return null;
    }

}
