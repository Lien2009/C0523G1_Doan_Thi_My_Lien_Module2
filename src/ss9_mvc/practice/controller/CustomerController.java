package ss9_mvc.practice.controller;

import ss9_mvc.practice.model.Customer;
import ss9_mvc.practice.service.CustomerService;
import ss9_mvc.practice.service.ICustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    private static ICustomerService service = new CustomerService();
    private static int number = 0;

    public static void main(String[] args) {
        do {
            System.out.println("CUSTOMER LIST");
            System.out.println("1.Display all");
            System.out.println("2.Add");
            System.out.println("3.Remove");
            System.out.println("4.Search");
            System.out.println("5.Sort by Customer Type");
            System.out.println("6.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    service.displayAll();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.removeCustomer();
                    break;
                case 4:
                    service.findByName();
                    break;
                case 5:
                    service.sortByCustomerType();
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
