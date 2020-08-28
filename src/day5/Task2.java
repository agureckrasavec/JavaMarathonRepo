package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle(2001,"Grey", "Honda CBR600");
        System.out.println("Модель: " + motorcycle1.getModel());
        System.out.println("Год выпуска: " + motorcycle1.getYearOfIssue());
        System.out.println("Цвет: " + motorcycle1.getColor());
    }
}
class Motorcycle {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorcycle(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
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
