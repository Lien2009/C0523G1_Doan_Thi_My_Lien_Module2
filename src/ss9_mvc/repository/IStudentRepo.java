package ss9_mvc.repository;

import ss9_mvc.model.Student;

public interface IStudentRepo {
    Student[] displayAll();
    void addStudent(Student student);
}
