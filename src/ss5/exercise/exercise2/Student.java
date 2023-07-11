package ss5.exercise.exercise2;

public class Student {
    private String name  = "John";
    private String classes = "C02";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
