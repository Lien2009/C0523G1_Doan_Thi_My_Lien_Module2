package furamaResort.controller;

import furamaResort.service.customer.CustomerService;
import furamaResort.service.customer.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void showCustomerMenu() {
        ICustomerService service = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---CUSTOMER---");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
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
                    service.getAll();
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
        }while (true);
    }
}
