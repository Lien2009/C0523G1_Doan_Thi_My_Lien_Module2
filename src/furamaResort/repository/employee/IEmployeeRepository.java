package furamaResort.repository.employee;

import furamaResort.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    int findId(String id);
    List<Employee> getAll();
    void add(Employee employee);
    void edit(String id, Employee employee);
    void delete(String id);
    List<Employee> search(String name);
}
