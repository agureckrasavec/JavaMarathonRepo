package day8;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 2001, 30, 13000);
        plane.fillUp(3000);
        System.out.println(plane);
    }
}
