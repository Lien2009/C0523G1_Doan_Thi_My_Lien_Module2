package furamaResort.service.employee;

import furamaResort.model.Employee;
import furamaResort.regex.EmployeeRegex;
import furamaResort.repository.employee.EmployeeRepository;
import furamaResort.repository.employee.IEmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository repository = new EmployeeRepository();
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
        }while (!EmployeeRegex.checkId(identify));
        System.out.println("Enter phone number:");
        String phoneNumber;
        do {
            phoneNumber = scanner.nextLine();
        }while (!EmployeeRegex.checkPhone(phoneNumber));
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
    public void getAll() {
        List<Employee> employeeList = repository.getAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter ID:");
        String id;
        do {
            id = scanner.nextLine();
        }while (!EmployeeRegex.checkId(id));
        if(repository.findId(id) != -1){//check đã tồn tại
            System.out.println("Don't add an already existing ID");
            return;
        }
        String[] employeeData = enterInfo();
        Employee employee = new Employee(id, employeeData[0], employeeData[1], employeeData[2], employeeData[3], employeeData[4], employeeData[5], employeeData[6], employeeData[7], Double.parseDouble(employeeData[8]));
        repository.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Enter ID you want to edit:");
        String chooseId;
        do {
            chooseId = scanner.nextLine();
        }while (!EmployeeRegex.checkId(chooseId));
        if(repository.findId(chooseId) == -1){//check ko tồn tại
            System.out.println("Not found!");
            return;
        }
        System.out.println("Enter new information:");
        String[] employeeData = enterInfo();
        Employee employee = new Employee(chooseId, employeeData[0], employeeData[1], employeeData[2], employeeData[3], employeeData[4], employeeData[5], employeeData[6], employeeData[7], Double.parseDouble(employeeData[8]));
        repository.edit(chooseId, employee);
    }

    @Override
    public void delete() {
        System.out.println("Enter ID you want to delete:");
        String chooseId;
        do {
            chooseId = scanner.nextLine();
        }while (!EmployeeRegex.checkId(chooseId));
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
