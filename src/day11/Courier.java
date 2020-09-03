package day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.balance += 1000;
        if (warehouse.balance == 1000000)
            bonus();

    }

    @Override
    public void bonus() {
        salary = salary * 2;


    }
}
