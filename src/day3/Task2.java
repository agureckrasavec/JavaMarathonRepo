package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double result = a / b;
            System.out.println(result);
            if (b == 0) {
               break;
            }
        }
    }
}
