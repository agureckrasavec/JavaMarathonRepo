package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int moreThanEight = 0;
        int one = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt((10) + 1);
            array[i] = x;
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 8 && array[i] % 2 == 0) {
                moreThanEight++;
                even++;
            }
            else if (array[i] > 8 && array[i] % 2 != 0) {
                moreThanEight++;
                odd++;
            }
            else if (array[i] == 1) {
                one++;
                odd++;
            }
            else if (array[i] % 2 == 0) {
                even++;
            }
            else if (array[i] % 2 != 0) {
                odd++;
            }
        }
        for (Integer x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Длинна массива: " + n);
        System.out.println("Количестве чисел больше 8: " + moreThanEight);
        System.out.println("Количестве чисел равных 1: " + one);
        System.out.println("Количестве четных чисел: " + even);
        System.out.println("Количестве нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
