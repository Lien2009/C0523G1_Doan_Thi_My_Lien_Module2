package furamaResort.service.customerService;

import furamaResort.model.Customer;
import furamaResort.model.Employee;
import furamaResort.regex.CustomerRegex;
import furamaResort.regex.EmployeeRegex;
import furamaResort.repository.customerRepo.CustomerRepository;
import furamaResort.repository.customerRepo.ICustomerRepository;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepository repository = new CustomerRepository();
    static Scanner scanner = new Scanner(System.in);

    public static String[] enterInfo() {
        System.out.println("Enter name:");
        String name;
        do {
            name = scanner.nextLine();
        }while (!EmployeeRegex.checkName(name));
        System.out.println("Enter date of birth:");
        String dateOfBirth = EmployeeRegex.checkDate();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Identify number:");
        String identify;
        do {
            identify = scanner.nextLine();
        }while (!EmployeeRegex.checkIdentify(identify));
        System.out.println("Enter phone number:");
        String phoneNumber;
        do {
            phoneNumber = scanner.nextLine();
        }while (!EmployeeRegex.checkPhone(phoneNumber));
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter type:");
        String type = CustomerRegex.type();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        String[] inforList = {name, dateOfBirth, gender, identify, phoneNumber, email, type, address};
        return inforList;
    }

    @Override
    public void display() {
        List<Customer> customerList = repository.display();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter ID:");
        String id;
        do {
            id = scanner.nextLine();
        }while (!CustomerRegex.checkId(id));
        if(repository.findId(id) != -1){
            System.out.println("Don't add an already existing ID");
            return;
        }
        String[] arr = enterInfo();
        Customer customer = new Customer(id, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
        repository.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Enter ID you want to edit:");
        String id;
        do {
            id = scanner.nextLine();
        }while (!CustomerRegex.checkId(id));
        if(repository.findId(id) == -1){
            System.out.println("Not found!");
            return;
        }
        String[] arr = enterInfo();
        Customer customer = new Customer(id, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
        repository.edit(id, customer);
    }

    @Override
    public void delete() {
        System.out.println("Enter ID you want to delete:");
        String chooseId;
        do {
           chooseId = scanner.nextLine();
        }while (!CustomerRegex.checkId(chooseId));
        if(repository.findId(chooseId) == -1){//check ko tồn tại
            System.out.println("Not found!");
            return;
        }
        repository.delete(chooseId);
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's name:");
        String name = scanner.nextLine();
        List<Customer> customers = repository.search(name);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
