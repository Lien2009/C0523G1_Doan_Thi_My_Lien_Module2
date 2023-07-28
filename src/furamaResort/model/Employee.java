package furamaResort.model;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String identify, String phoneNumber, String email, String level, String position, Double salary) {
        super(id, name, dateOfBirth, gender, identify, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getInfoCSV() {
        return super.getInfoCsv()+","+ this.level+","+this.position+","+this.salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary;
    }
}
