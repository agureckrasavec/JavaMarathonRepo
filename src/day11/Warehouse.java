package day11;

public class Warehouse {
    protected static int countOrder;
    protected static int balance;

    public Warehouse() {
        countOrder = 0;
        balance = 0;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + countOrder + "\n" +
        "Доход от доставленных заказов: " + balance;
    }
}
