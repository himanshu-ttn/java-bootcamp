package com.tothenew.intro_to_java_2.ques4;

public class FactoryDesignExample {
    static void main(String[] args) {
        Shape circleShape = ShapeFactory.getShape(MyShape.CIRCLE);
        circleShape.draw();

        Shape squareShape = ShapeFactory.getShape(MyShape.SQUARE);
        squareShape.draw();

        Shape rectShape = ShapeFactory.getShape(MyShape.RECTANGLE);
        rectShape.draw();
    }
}
