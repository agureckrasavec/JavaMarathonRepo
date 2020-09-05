package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user) {
        user.subscriptions.add(this);
    }
    public boolean isSubscribed(User user) {
        boolean b = false;
        for (int i = 0; i < this.subscriptions.size(); i++) {
            if (this.subscriptions.get(i).equals(user))
                b = true;
        }
        return b;
    }
    public boolean isFriend(User user) {
        boolean b = false;
        for (int i = 0; i < this.subscriptions.size(); i++) {
            if (this.subscriptions.get(i).equals(user) && this.isSubscribed(user))
                b = true;
            else
                b = false;
        }
        return b;
    }
    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "Имя пользователя " + username;
    }
}
