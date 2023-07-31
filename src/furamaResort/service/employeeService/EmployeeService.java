package furamaResort.service.employeeService;

import furamaResort.model.Employee;
import furamaResort.regex.EmployeeRegex;
import furamaResort.repository.employeeRepo.EmployeeRepository;
import furamaResort.repository.employeeRepo.IEmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository repository = new EmployeeRepository();

    public static String[] enterInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = EmployeeRegex.checkName();
        System.out.println("Enter date of birth:");
        String dateOfBirth = EmployeeRegex.checkDate();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter Identify number:");
        String identify = EmployeeRegex.checkIdentify();
        System.out.println("Enter phone number:");
        String phoneNumber = EmployeeRegex.checkPhone();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter level:");
        String level = EmployeeRegex.level();
        System.out.println("Enter position:");
        String position = EmployeeRegex.position();
        System.out.println("Enter salary:");
        Double salary;
        do {
            salary = Double.parseDouble(scanner.nextLine());
            if (salary <= 0) {
                System.out.println("Enter salary again!");
            }
        } while (salary <= 0);
        String[] inforList = {name, dateOfBirth, gender, identify, phoneNumber, email, level, position, String.valueOf(salary)};
        return inforList;
    }

    @Override
    public void display() {
        List<Employee> employeeList = repository.display();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter ID:");
        String id = EmployeeRegex.checkId();
        if(repository.findId(id) != -1){//check đã tồn tại
            System.out.println("Don't add an already existing ID");
            return;
        }
        String[] arr = enterInfo();
        Employee employee = new Employee(id, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], Double.parseDouble(arr[8]));
        repository.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Enter ID you want to edit:");
        String chooseId = EmployeeRegex.checkId();//check đúng format
        if(repository.findId(chooseId) == -1){//check ko tồn tại
            System.out.println("Not found!");
            return;
        }
        System.out.println("Enter new information:");
        String[] arr = enterInfo();
        Employee employee = new Employee(chooseId, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], Double.parseDouble(arr[8]));
        repository.edit(chooseId, employee);
    }

    @Override
    public void delete() {
        System.out.println("Enter ID you want to delete:");
        String chooseId = EmployeeRegex.checkId();
        if(repository.findId(chooseId) == -1){//check ko tồn tại
            System.out.println("Not found!");
            return;
        }
        repository.delete(chooseId);
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = scanner.nextLine();
        List<Employee> employees = repository.search(name);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
