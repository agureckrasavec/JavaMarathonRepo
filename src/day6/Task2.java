package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 1997, 20, 13000);
        plane.setYearOfIssue(2000);
        plane.setLength(24);
        plane.fillUp(200);
        plane.fillUp(333);
        plane.info();
    }
}
