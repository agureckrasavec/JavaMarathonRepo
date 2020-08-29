package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Lexus 570", "Black", 2012);
        Motorcycle motorcycle = new Motorcycle("Honda CBR600", "Grey", 1997);

        int carDifferenceOfYears = car.years(1990);
        int motorcycleDifferenceOfYears = motorcycle.years(1990);
        System.out.println(carDifferenceOfYears);
        System.out.println(motorcycleDifferenceOfYears);
        car.thisIsCar();
        motorcycle.thisIsMotorcycle();
    }
}
