package day6;

public class Motorcycle {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorcycle() {

    }
    public Motorcycle(String model, String color, int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public void thisIsMotorcycle() {
        System.out.println("Это мотоцикл");
    }

    public int years(int y) {
        int x = this.yearOfIssue - y;
        return x;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
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
