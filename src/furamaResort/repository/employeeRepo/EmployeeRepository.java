package furamaResort.repository.employeeRepo;

import furamaResort.model.Employee;
import furamaResort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String EMPLOYEE_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\employee.csv";

    @Override
    public int findId(String id) {
        List<Employee> employeeList = display();
        int index = -1;
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                index = employeeList.indexOf(employee);
            }
        }
        return index;
    }

    @Override
    public List<Employee> display() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(EMPLOYEE_FILE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoCSV());
        ReadAndWrite.writeFile(EMPLOYEE_FILE, stringList, true);
    }

    @Override
    public void edit(String id, Employee employee) {
        int index = findId(id);
        List<Employee> employeeList = display();
        employeeList.set(index, employee);
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoCSV());
        }
        ReadAndWrite.writeFile(EMPLOYEE_FILE, stringList, false);
    }

    @Override
    public void delete(String id) {
        int index = findId(id);
        List<Employee> employeeList = display();
        employeeList.remove(index);
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoCSV());
        }
        ReadAndWrite.writeFile(EMPLOYEE_FILE, stringList, false);
    }

    @Override
    public List<Employee> search(String name) {
        List<Employee> employeeList = display();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)) {
                employees.add(employeeList.get(i));
            }
        }
        return employees;
    }
}
