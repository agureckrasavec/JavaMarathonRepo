package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < parseFileToStringList().size(); i++) {
               String[] temp = parseFileToStringList().get(i).split(" ");
               int x = Integer.parseInt(temp[1]);
               if (x <= 0) {
                   throw new IOException();
               }
            }
            System.out.println(parseFileToStringList());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
        public static List<String> parseFileToStringList() throws FileNotFoundException {
            List<String> test = new ArrayList<>();
            File file = new File("people");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                test.add(sc.nextLine());
            }
            return test;
        }
}

