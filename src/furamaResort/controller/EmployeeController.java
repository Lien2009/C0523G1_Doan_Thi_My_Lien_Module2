package furamaResort.controller;

import furamaResort.service.employeeService.EmployeeService;
import furamaResort.service.employeeService.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public static void showEmployeeMenu() {
        IEmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---EMPLOYEE---");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search by name employee");
            System.out.println("6. Return main menu");
            System.out.println("Enter your choose:");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Enter number format!");
            }
            switch (choose) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.edit();
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    service.search();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
            }
        } while (true);
    }
}
