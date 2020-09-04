package day12.task4;


public class Task4 {
    public static void main(String[] args) {
        MusicBand theBeatles = new MusicBand("The Beatles", 1960);
        MusicBand ledZeppelin = new MusicBand("Led Zeppelin", 1965);
        theBeatles.getMembersName().add("Джон Ленон");
        theBeatles.getMembersName().add("Ринго Стар");
        ledZeppelin.getMembersName().add("Джимми Пейдж");
        ledZeppelin.getMembersName().add("Роберт Плант");

        MusicBand.bandsMerge(theBeatles, ledZeppelin);

        for (String s : ledZeppelin.getMembersName()) {
            System.out.println(s);
        }
    }
}
