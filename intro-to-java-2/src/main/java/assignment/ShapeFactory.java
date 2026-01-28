package assignment;

public class ShapeFactory {

    // Factory Method
    public static Shape getShape(MyShape shapeType) {

        if (shapeType == null) {
            return null;
        }

        switch (shapeType) {
            case CIRCLE: return new Circle();
            case RECTANGLE: return new Rectangle();
            case SQUARE: return new Square();
        }

        return null;
    }

}
