package day6;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Teacher {
    private String fullName;
    private String subject;

    public Teacher(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    public void rateStudent(Student student) {
        Random random = new Random();
        String text = "Преподаватель " + this.fullName + " оценил студента с именем " + student.getFullName()
                + " по предмету " + this.subject + " на оценку";
        int rate = random.nextInt(4) + 2;
        switch (rate) {
            case 2 :
                System.out.println(text + " неудовлетворительно");
                break;
            case 3 :
                System.out.println(text + " удовлетворительно");
                break;
            case 4 :
                System.out.println(text + " хорошо");
                break;
            case 5 :
                System.out.println(text + " отлично");
                break;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
