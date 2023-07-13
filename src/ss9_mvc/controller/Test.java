package ss9_mvc.controller;

import ss9_mvc.model.Student;
import ss9_mvc.service.IStudentService;
import ss9_mvc.service.StudentService;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static IStudentService service = new StudentService();
    private static int number = 0;
    public static void main(String[] args) {
        do {
            System.out.println("STUDENT");
            System.out.println("1.Display all");
            System.out.println("2.Add");
            System.out.println("3.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println(Arrays.toString(service.displayAll()));
                    break;
                case 2:
                    System.out.println("Enter name:");
                    String name = scanner.next();
                    System.out.println("Enter ID:");
                    int id = scanner.nextInt();
                    Student student = new Student(name,id);
                    service.addStudent(student);
                    break;
            }
        } while (number<3);
    }
}
