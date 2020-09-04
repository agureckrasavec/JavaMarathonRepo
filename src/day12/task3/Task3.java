package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        List<MusicBand> musicBands21century = new ArrayList<>();
        musicBands.add(new MusicBand("The Beatles", 1960));
        musicBands.add(new MusicBand("Led Zeppelin", 1968));
        musicBands.add(new MusicBand("The Doors", 1965));
        musicBands.add(new MusicBand("Electric Light Orchestra", 1970));
        musicBands.add(new MusicBand("AC/DC", 1973));
        musicBands.add(new MusicBand("BTS", 2013));
        musicBands.add(new MusicBand("The Killers", 2001));
        musicBands.add(new MusicBand("Fort Minor", 2004));
        musicBands.add(new MusicBand("Fall Out Boy", 2001));
        musicBands.add(new MusicBand("My Chemical Romance", 2001));
        Collections.shuffle(musicBands);
        for (int i = 0; i < musicBands.size(); i++) {
            if (musicBands.get(i).getYear() >= 2000) {
                musicBands21century.add(musicBands.get(i));
            }
        }
        for (Object o : musicBands21century) {
            System.out.println(o);
        }

    }
}
