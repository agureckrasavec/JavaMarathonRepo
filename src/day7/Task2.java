package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);
        Player player4 = new Player(4);
        Player player5 = new Player(5);
        Player player6 = new Player(6);
        Player player7 = new Player(7);
        Player player8 = new Player(8);


        System.out.println("Игроков на поле: " + Player.getCountPlayers());

        while (true) {
            Player.run(player1);
            if (player1.getStamina() == Player.getMinStamina()) {
                break;
            }
        }
        Player.info();
        Player.run(player1);
        Player.run(player1);
        Player.run(player1);
        Player.info();
        System.out.println("Выносливость игрока №1: " + player1.getStamina());
    }
}
