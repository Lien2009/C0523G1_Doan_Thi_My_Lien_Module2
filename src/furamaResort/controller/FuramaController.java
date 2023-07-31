package furamaResort.controller;

import furamaResort.model.Facility;

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
            int choose = 0;
            System.out.println("Enter your choose:");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Enter number format!");
            }
            switch (choose) {
                case 1:
                    EmployeeController.showEmployeeMenu();
                    break;
                case 2:
                    CustomerController.showCustomerMenu();
                    break;
                case 3:
                    FacilityController.showFacilityMenu();
                    break;
                case 4:
                    BookingController.showBookingMenu();
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
