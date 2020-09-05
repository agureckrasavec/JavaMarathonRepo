package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Пользователь №1");
        User user2 = new User("Пользователь №2");
        User user3 = new User("Пользователь №3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела ?");

        user2.sendMessage(user1, "Здаров!");
        user2.sendMessage(user1, "Отлично!");
        user2.sendMessage(user1, "А у тя как ?");

        user3.sendMessage(user1, "Здаров!");
        user3.sendMessage(user1, "Когда вернешь деньги ?! А!");
        user3.sendMessage(user1, "Год уже скоро пройдет!");
        user3.sendMessage(user1, "Имей совесть.");
        user1.sendMessage(user3, "Привет! Никогда.");

        MessageDatabase.showDialog(user1, user3);




    }
}
