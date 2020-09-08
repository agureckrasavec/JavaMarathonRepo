package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        FileWriter fileWriter = new FileWriter("day16int.txt");
        File file = new File("day16int.txt");
        Scanner sc = new Scanner(file);
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
            fileWriter.write(i + " ");
        }

        fileWriter.close();
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        sc.close();

       for (int i = 0; i < list.size(); i++) {
           counter++;
           sum += list.get(i);
           if (counter == 20) {
               d = (double) sum / counter;
               finalSum += (int) d;
               fileWriter2.write(d + " ");
               sum = 0;
               counter = 0;
               d = 0;
           }
       }
        fileWriter2.close();
        System.out.println(finalSum);
    }
}

