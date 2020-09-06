package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day14");
        int sum = 0;
        int counter = 0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                counter++;
                sum += sc.nextInt();
            }
            if (counter != 10) {
                throw new IOException();
            }
            else
                System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
