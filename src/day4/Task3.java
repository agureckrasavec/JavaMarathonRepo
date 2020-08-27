package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int tempSum = 0;
        int sum = 0;
        int index = 0;

        int[][] matrix = new int[12][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int x = random.nextInt((50) + 1);
                matrix[i][j] = x;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                tempSum += matrix[i][j];
                if (tempSum >= sum) {
                    sum = tempSum;
                    index = i;
                }
            }
            tempSum = 0;
            System.out.println();
        }
        System.out.println();
        System.out.println(index);
    }
}
