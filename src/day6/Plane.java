package day6;

public class Plane {
    private String manufacturer;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int volumeFuelTank;

    public Plane(String manufacturer, int yearOfIssue, int length, int weight) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
        this.volumeFuelTank = 0;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void fillUp(int x) {
        this.volumeFuelTank += x;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.manufacturer + ", год выпуска: " + this.yearOfIssue
                + ", длина: " + length + ", вес: " + this.weight + ", объём топлива в баке " + this.volumeFuelTank);
    }


}
