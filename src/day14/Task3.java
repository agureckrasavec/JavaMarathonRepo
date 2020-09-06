package day14;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        try {
           for (int i = 0; i < Person.parseFileToObjList().size(); i++) {
               if (Person.parseFileToObjList().get(i).getAge() <= 0) {
                   throw new IOException();
               }
           }
            System.out.println(Person.parseFileToObjList());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Неккоректный входной файл");
        }
    }
}
