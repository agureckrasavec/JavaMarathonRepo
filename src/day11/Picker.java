package day11;

public class Picker implements Worker {
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
        salary += 80;
        warehouse.countOrder += 1;
        if (warehouse.countOrder == 1500)
            bonus();
    }

    @Override
    public void bonus() {
        salary = salary * 3;
    }
}
