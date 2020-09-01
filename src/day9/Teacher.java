package day9;

public class Teacher extends Human {
    private String name;
    private String subjectName;


    public Teacher(String name, String subjectName) {
        super(name);
        this.name = name;
        this.subjectName = subjectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.name);
    }
}
