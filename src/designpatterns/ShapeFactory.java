package designpatterns;

interface Shape {
    String draw();
}

class Circle implements Shape {
    @Override
    public String draw() {
        return "Drawing a Circle";
    }
}

class Rectangle implements Shape {
    @Override
    public String draw() {
        return "Drawing a Rectangle";
    }
}

class Triangle implements Shape {
    @Override
    public String draw() {
        return "Drawing a Triangle";
    }
}

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "TRIANGLE":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Unknown shape: " + shapeType);
        }
    }
}
