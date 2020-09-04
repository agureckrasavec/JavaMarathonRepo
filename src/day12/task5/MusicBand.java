package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtists = new ArrayList<>();

    public List<MusicArtist> getMusicArtists() {
        return musicArtists;
    }

    public void setMusicArtists(List<MusicArtist> musicArtists) {
        this.musicArtists = musicArtists;
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
        List<MusicArtist> tempList = new ArrayList<>(musicBandB.getMusicArtists());
        musicBandB.getMusicArtists().clear();
        musicBandB.getMusicArtists().addAll(musicBandA.getMusicArtists());
        musicBandA.getMusicArtists().clear();
        musicBandA.getMusicArtists().addAll(tempList);

    }

    @Override
    public String toString() {
        return "Название: " + name + ", " + "год создания: " + year;
    }
}
