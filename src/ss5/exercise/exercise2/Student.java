package ss5.exercise.exercise2;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "John";
        this.classes = "C02";
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
