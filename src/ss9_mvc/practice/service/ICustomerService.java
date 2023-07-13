package ss9_mvc.practice.service;

import ss9_mvc.model.Student;
import ss9_mvc.practice.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    ArrayList<Customer> displayAll();

    void add(Customer e);

    void removeCustomer(int id);

    Customer indexOf(String name);
}
