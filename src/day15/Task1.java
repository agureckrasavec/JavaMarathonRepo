package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("shoes.csv");
            FileWriter fileWriter = new FileWriter("day15");
            BufferedReader rd = new BufferedReader(new InputStreamReader(fileInputStream));
            List<String> strings = new ArrayList<>();

            while (rd.ready()) {
                    strings.add(rd.readLine());
            }
            fileInputStream.close();
            rd.close();
            for (String s : strings) {
                if (s.contains(";0")) {
                    fileWriter.write(s + "\n");
                }
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
