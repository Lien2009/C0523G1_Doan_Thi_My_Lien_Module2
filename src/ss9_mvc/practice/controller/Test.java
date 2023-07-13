package ss9_mvc.practice.controller;

import ss9_mvc.practice.model.Customer;
import ss9_mvc.practice.service.CustomerService;
import ss9_mvc.practice.service.ICustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    private static ICustomerService service = new CustomerService();
    private static int number = 0;

    public static void main(String[] args) {
        do {
            System.out.println("CUSTOMER LIST");
            System.out.println("1.Display all");
            System.out.println("2.Add");
            System.out.println("3.Remove");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    ArrayList<Customer> myCustomer = service.displayAll();
                    for (int i = 0; i < myCustomer.size(); i++) {
                        System.out.println(myCustomer.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter new Id:");
                    int id = scanner.nextInt();
                    System.out.println("Enter new Name:");
                    String name = scanner.next();
                    System.out.println("Enter new Age:");
                    int age = scanner.nextInt();
                    System.out.println("Enter new Type:");
                    String typeCustomer = scanner.next();
                    Customer customer = new Customer(id,name,age,typeCustomer);
                    service.add(customer);
                    break;
                case 3:
                    System.out.println("Enter ID remove:");
                    int removeId = scanner.nextInt();
                    service.removeCustomer(removeId);
                    break;
            }
        } while (number<5);
    }
}
