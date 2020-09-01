package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bob", "test");
        Teacher teacher = new Teacher("Sam", "English");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
