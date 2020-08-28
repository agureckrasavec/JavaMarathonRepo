package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2012);
        car1.setColor("Black");
        car1.setModel("Lexus LX570");
        System.out.println("Модель: " + car1.getModel());
        System.out.println("Год выпуска: " + car1.getYearOfIssue());
        System.out.println("Цвет: " + car1.getColor());
    }
}
    class Car {
    private int yearOfIssue;
    private String color;
    private String model;

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
