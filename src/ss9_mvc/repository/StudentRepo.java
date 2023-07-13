package ss9_mvc.repository;

import ss9_mvc.model.Student;

import java.util.Arrays;

public class StudentRepo implements IStudentRepo {
    private static Student[] students = new Student[10];
    private static int size;

    static {
        students[0] = new Student("A", 1);
        students[1] = new Student("B", 2);
        students[2] = new Student("C", 3);
        students[3] = new Student("D", 4);
        size = 4;
    }

    @Override
    public Student[] displayAll() {
        Student[] students1 = new Student[size];//tạo mảng mới có độ dài size chứa phần tử mảng cũ
        for (int i = 0; i < size; i++) {
            students1[i] = students[i];
        }
        return students1;
    }

    @Override
    public void addStudent(Student student) {
        students[size] = student;
        size++;
    }
}
