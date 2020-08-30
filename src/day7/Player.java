package day7;

import java.util.Random;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_COUNT_PLAYERS = 6;
    static int countPlayers;
    int id;
    int stamina;

    public int getStamina() {
        return stamina;
    }

    Random random = new Random();

    public Player(int id) {
        this.id = id;
        this.stamina = random.nextInt(MAX_STAMINA - 90 + 1) + 90;
        if (countPlayers < MAX_COUNT_PLAYERS) {
            countPlayers++;
        }
    }

    public static void run(Player player) {
            player.stamina--;
            System.out.println("Игрок №" + player.id + " бежит, Его выносливость: " + player.getStamina());
        if (player.stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок № " + player.id + " устал и покидает поле");
        }
    }

    public static void info() {
        switch (countPlayers) {
            case 0 :
                System.out.println("Команды неполные, ещё есть " + MAX_COUNT_PLAYERS + " свободных мест");
                break;
            case 1 :
                System.out.println("Команды неполные, ещё есть " + (MAX_COUNT_PLAYERS - 1) + " свободных мест");
                break;
            case 2 :
                System.out.println("Команды неполные, ещё есть " + (MAX_COUNT_PLAYERS - 2) + " свободных мест");
                break;
            case 3 :
                System.out.println("Команды неполные, ещё есть " + (MAX_COUNT_PLAYERS - 3) + " свободных мест");
                break;
            case 4 :
                System.out.println("Команды неполные, ещё есть " + (MAX_COUNT_PLAYERS - 4) + " свободных места");
                break;
            case 5 :
                System.out.println("Команды неполные, ещё есть " + (MAX_COUNT_PLAYERS - 5) + " свободное место");
                break;
            default:
                System.out.println("Мест в командах больше нет");
        }
    }
}
