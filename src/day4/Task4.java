package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int sum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt((10000) + 1);
            array[i] = x;
        }

        for (int i = 2; i < array.length; i++) {
            int tempSum = 0;
            tempSum = array[i] + array[i - 1] + array[i - 2];
            if (tempSum > sum) {
                sum = tempSum;
                index = i - 2;
                }
        }

        System.out.println(sum);
        System.out.println(index);

    }
}
