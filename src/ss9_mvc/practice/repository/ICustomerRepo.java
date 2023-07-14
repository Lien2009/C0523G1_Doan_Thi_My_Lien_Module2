package ss9_mvc.practice.repository;

import ss9_mvc.model.Student;
import ss9_mvc.practice.model.Customer;

import java.util.ArrayList;

public interface ICustomerRepo {
    ArrayList<Customer> displayAll();

    void add(Customer e);

    void removeCustomer(int id);

    void indexOf(String name);
}
