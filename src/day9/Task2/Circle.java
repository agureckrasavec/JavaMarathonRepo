package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (radius*radius)*Math.PI;
    }

    @Override
    public double perimeter() {
        return radius*(Math.PI * 2);
    }
}
