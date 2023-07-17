package ss9_mvc.practice.service;

import ss9_mvc.model.Student;
import ss9_mvc.practice.model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    void displayAll();

    void add();

    void removeCustomer();

    void findByName();
    void sortByCustomerType();
}
