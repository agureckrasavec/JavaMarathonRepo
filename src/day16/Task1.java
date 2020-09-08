package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14");
        int sum = 0;
        double d = 0;
        int counter = 0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                counter++;
                sum += sc.nextInt();
            }
            d = (double) sum / counter;
            System.out.println(d);
            System.out.printf("%.3f", d);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
