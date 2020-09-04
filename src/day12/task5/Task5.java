package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand theBeatles = new MusicBand("The Beatles", 1960);
        MusicBand ledZeppelin = new MusicBand("Led Zeppelin", 1965);
        theBeatles.getMusicArtists().add(new MusicArtist("Джон Ленон", 34));
        theBeatles.getMusicArtists().add(new MusicArtist("Ринго Стар", 33));
        ledZeppelin.getMusicArtists().add(new MusicArtist("Джимми Пейдж", 30));
        ledZeppelin.getMusicArtists().add(new MusicArtist("Роберт Плант", 30));
        MusicBand.bandsMerge(theBeatles, ledZeppelin);

        for (Object o : ledZeppelin.getMusicArtists()) {
            System.out.println(o);
        }
    }
}
