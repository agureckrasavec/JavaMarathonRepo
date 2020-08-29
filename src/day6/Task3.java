package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Сидоров Иван Иванович", "русский язык");
        Student student = new Student("Иванов Владимир Владимирович");
        teacher.rateStudent(student);
    }
}
