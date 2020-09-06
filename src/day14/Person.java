package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Person> parseFileToObjList() throws FileNotFoundException {
        List<Person> people = new ArrayList<>();
        File file = new File("people");
        Scanner sc = new Scanner(file);
        String names = null;

        while (sc.hasNext()) {
            names = sc.nextLine();
            String[] strings = names.split(" ");
            for (int i = 1; i < strings.length; i++) {
                String name = strings[i - 1];
                int age = Integer.parseInt(strings[i]);
                people.add(new Person(name, age));
            }
        }
        return people;
    }

    @Override
    public String toString() {
        return "name=" + name + ", year=" + age;
    }
}
