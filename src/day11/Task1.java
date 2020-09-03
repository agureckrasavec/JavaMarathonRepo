package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker();
        Courier courier = new Courier();

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
        }
        for (int i = 0; i < 1000; i++) {
            courier.doWork();
        }

        System.out.println("Скад: \n" +
                        warehouse);
        System.out.println("\n" + "ЗП:");
        System.out.println("Заработанная зарплата сборщика: " + picker.getSalary());
        System.out.println("Заработанная зарплата курьера: " + courier.getSalary());
    }
}
