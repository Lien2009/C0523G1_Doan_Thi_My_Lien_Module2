package ss9_mvc.practice.service;

import ss9_mvc.practice.model.Customer;
import ss9_mvc.practice.repository.CustomerRepo;
import ss9_mvc.practice.repository.ICustomerRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private ICustomerRepo repository = new CustomerRepo();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayAll() {
        ArrayList<Customer> myCustomer = repository.displayAll();
        for (int i = 0; i < myCustomer.size(); i++) {
            System.out.println(myCustomer.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Enter new Id:");
        int id = scanner.nextInt();
        System.out.println("Enter new Name:");
        String name = scanner.next();
        System.out.println("Enter new Age:");
        int age = scanner.nextInt();
        System.out.println("Enter new Type:");
        String typeCustomer = scanner.next();
        Customer customer = new Customer(id, name, age, typeCustomer);
        repository.add(customer);
    }

    @Override
    public void removeCustomer() {
        System.out.println("Enter ID remove:");
        int removeId = scanner.nextInt();
        repository.removeCustomer(removeId);
    }

    @Override
    public void findByName() {
        System.out.println("Enter name:");
        String searchname = scanner.next();
        repository.findByName(searchname);
    }

    @Override
    public void sortByCustomerType() {
//        ICustomerRepo myCustomer;
//        myCustomer.sortByCustomerType();
//        myCustomer.displayAll();
    }
}
