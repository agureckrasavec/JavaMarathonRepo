package day8;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Date currentTime = new Date();
        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        Date newTime = new Date();

        String numbers = "";

        Date currentTime2 = new Date();
        for (int i = 0; i < 20001; i++) {
            numbers = numbers + i + " ";
        }
        System.out.println(numbers);
        Date newTime2 = new Date();

        long stringBuilderMsDelay = newTime.getTime() - currentTime.getTime();
        long stringMsDelay = newTime2.getTime() - currentTime2.getTime();

        System.out.println("Время выполнения StringBuilder: " + stringBuilderMsDelay);
        System.out.println("Время выполнения String: " + stringMsDelay);
    }
}
