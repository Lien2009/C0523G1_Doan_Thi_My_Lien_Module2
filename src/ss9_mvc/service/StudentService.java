package ss9_mvc.service;

import ss9_mvc.model.Student;
import ss9_mvc.repository.IStudentRepo;
import ss9_mvc.repository.StudentRepo;

public class StudentService implements IStudentService {
    private IStudentRepo repository = new StudentRepo();//service gọi từ repo nên tạo đối tượng repo để gọi


    @Override
    public Student[] displayAll() {
        return repository.displayAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}
