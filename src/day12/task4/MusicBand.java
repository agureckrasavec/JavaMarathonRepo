package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> membersName = new ArrayList<>();

    public List<String> getMembersName() {
        return membersName;
    }

    public void setMembersName(List<String> membersName) {
        this.membersName = membersName;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void bandsMerge(MusicBand musicBandA, MusicBand musicBandB) {
        List<String> tempList = new ArrayList<>(musicBandB.getMembersName());
        musicBandB.getMembersName().clear();
        musicBandB.getMembersName().addAll(musicBandA.getMembersName());
        musicBandA.getMembersName().clear();
        musicBandA.getMembersName().addAll(tempList);


    }

    @Override
    public String toString() {
        return "Название: " + name + ", " + "год создания: " + year;
    }
}
