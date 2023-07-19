package ss12.practice.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kien", 30, "HT"));
        studentList.add(new Student("Nam", 26, "HN"));
        studentList.add(new Student("Anh", 38, "HT"));
        studentList.add(new Student("Tung", 38, "HT"));
        Collections.sort(studentList);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList,ageComparator);
        System.out.println("So sánh theo tuổi:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}


