package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (true) {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
            else if (a == b) {
                break;
            }
        }
    }
}
