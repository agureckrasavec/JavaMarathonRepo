package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Toyota Crown");
        cars.add("Toyota Camry");
        cars.add("Toyota Land Cruiser");
        cars.add("Toyota Land Cruiser Prado");
        cars.add("Toyota Highlander");

        cars.add(2, "Nissan Patrol");
        cars.remove(0);
        for (String x : cars) {
            System.out.println(x);
        }

    }
}
