package day16;

import java.io.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        FileWriter fileWriter = new FileWriter("day16int.txt");
        FileWriter fileWriter2 = new FileWriter("day16double.txt");
        int counter = 0;
        int sum = 0;
        double d = 0;
        int finalSum = 0;

        int[] intArr = new int[1000];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.nextInt(101);
        }
        for (Integer i : intArr) {
            String s = Integer.toString(i);
            fileWriter.write(s + " ");
        }
        fileWriter.close();
        for (int i = 0; i < intArr.length; i++) {
            counter++;
            sum += intArr[i];
            if (counter == 20) {
                d = (double) sum / counter;
                finalSum += (int) d;
                String s = Double.toString(d);
                fileWriter2.write(s + " ");
                sum = 0;
                counter = 0;
                d = 0;
                s = null;
            }
        }
        fileWriter2.close();
        System.out.println(finalSum);
    }
}

