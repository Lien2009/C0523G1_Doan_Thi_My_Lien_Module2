package ss9_mvc.service;

import ss9_mvc.model.Student;

public interface IStudentService {//business yc có 2 chức năng sau
    Student[] displayAll();//kiểu Dl mảng đối tượng Student
    void addStudent(Student student);//thêm đối tượng student vào mảng

}
