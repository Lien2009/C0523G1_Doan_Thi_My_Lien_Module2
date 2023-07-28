package furamaResort.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choose:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    EmployeeController.showEmployeeMenu();
                    break;
                case 2:
                    CustomerController.showCustomerMenu();
                    break;
                case 3:
                    System.out.println("---FACILITY---");
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Edit facility");
                    System.out.println("4. Delete facility");
                    System.out.println("5. Return main menu");
                    break;
                case 4:
                    System.out.println("---BOOKING---");
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("5. Return main menu");
                    break;
                case 5:
                    System.out.println("---PROMOTION---");
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
