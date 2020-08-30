package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 2001, 23, 13000);
        Airplane cessna = new Airplane("Cessna", 2009, 7, 5000);

        Airplane.comparePlanes(boeing, cessna);
    }
}
