package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("shoes.csv");
            FileWriter fileWriter = new FileWriter("day15.txt");
            BufferedReader rd = new BufferedReader(new InputStreamReader(fileInputStream));
            List<String> strings = new ArrayList<>();

            while (rd.ready()) {
                    strings.add(rd.readLine());
            }
            fileInputStream.close();
            rd.close();
            for (int i = 0; i < strings.size(); i++) {
                String[] line = strings.get(i).split(";");
                if (line[line.length - 1].equals("0"))
                    fileWriter.write(strings.get(i) + "\n");
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
