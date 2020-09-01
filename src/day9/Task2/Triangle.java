package day9.Task2;

public class Triangle extends Figure {
    private double lengthSide1;
    private double lengthSide2;
    private double lengthSide3;

    public Triangle(double lengthSide1, double lengthSide2, double lengthSide3, String color) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    public double getLengthSide1() {
        return lengthSide1;
    }

    public void setLengthSide1(double lengthSide1) {
        this.lengthSide1 = lengthSide1;
    }

    public double getLengthSide2() {
        return lengthSide2;
    }

    public void setLengthSide2(double lengthSide2) {
        this.lengthSide2 = lengthSide2;
    }

    public double getLengthSide3() {
        return lengthSide3;
    }

    public void setLengthSide3(double lengthSide3) {
        this.lengthSide3 = lengthSide3;
    }

    @Override
    public double area() {
        double p = (lengthSide1 + lengthSide2 + lengthSide3) / 2;
        return Math.sqrt(p * (p - lengthSide1) * (p - lengthSide2) * (p - lengthSide3));
    }

    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }
}
