package day13;


import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }
    public static void showDialog(User u1, User u2) {
        System.out.println("История диалога между " + u1.getUsername() + " и " + u2.getUsername()+":"+"\n");
        for (int i = 0; i < messages.size(); i++) {
                if (messages.get(i).getSender().equals(u1) && messages.get(i).getReceiver().equals(u2)) {
                    System.out.println(u1 + ": " + messages.get(i).getText());
                }
                if (messages.get(i).getSender().equals(u2) && messages.get(i).getReceiver().equals(u1)) {
                    System.out.println(u2 + ": " + messages.get(i).getText());
                }
        }

    }

}



