package ss17.practice.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss17\\practice\\practice2\\student.dat";
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
public static List<Student> readDataToFile(String path){
    List<Student> studentList = new ArrayList<>();
    try {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        studentList = (List<Student>) ois.readObject();
        fis.close();
        ois.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    return studentList;
}
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "A", "HN"));
        studentList.add(new Student(2, "B", "DN"));
        studentList.add(new Student(3, "C", "SG"));
        studentList.add(new Student(4, "D", "HN"));
        writeDataToFile(FILE, studentList);
        List<Student> studentData = readDataToFile(FILE);
        for(Student student:studentData){
            System.out.println(student);
        }
    }
}
