package day6;

public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Car() {

    }

    public int years(int y) {
        int x = this.yearOfIssue - y;
        return x;
    }

    public Car(String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public void thisIsCar() {
        System.out.println("Это автомобиль");
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}