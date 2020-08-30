package day7;

import java.util.Random;

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static final int MAX_COUNT_PLAYERS = 6;
    private static int countPlayers;
    private int id;
    private int stamina;

    public static int getMaxStamina() {
        return MAX_STAMINA;
    }

    public static int getMinStamina() {
        return MIN_STAMINA;
    }

    public static int getMaxCountPlayers() {
        return MAX_COUNT_PLAYERS;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

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
        if (player.stamina > MIN_STAMINA) {
            if (player.stamina > MIN_STAMINA) {
                player.stamina--;
                System.out.println("Игрок №" + player.id + " бежит, Его выносливость: " + player.getStamina());
            }
            if (player.stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.println("Игрок №" + player.id + " устал и покидает поле");
            }
        }
        else {
            System.out.println("Игрок №" + player.id + " покинул поле");
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
