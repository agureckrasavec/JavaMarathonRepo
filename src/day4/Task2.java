package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int maximum = 0;
        int minimum = 10000;
        int zero = 0;
        int sum = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt((10000) + 1);
            array[i] = x;
        }
        for (Integer x : array) {
            if (x > maximum) {
                maximum = x;
            }
            else if (x < minimum) {
                minimum = x;
            }
            else if (x % 10 == 0) {
                zero++;
                sum += x;
            }
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Наибольший элемент массива: " + maximum);
        System.out.println("Наименьший элемент массива: " + minimum);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
