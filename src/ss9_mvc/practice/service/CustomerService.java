package ss9_mvc.practice.service;

import ss9_mvc.practice.model.Customer;
import ss9_mvc.practice.repository.CustomerRepo;
import ss9_mvc.practice.repository.ICustomerRepo;

import java.util.ArrayList;

public class CustomerService implements ICustomerService {
    private ICustomerRepo repository = new CustomerRepo();

    @Override
    public ArrayList<Customer> displayAll() {
        return repository.displayAll();
    }

    @Override
    public void add(Customer e) {
        repository.add(e);
    }

    @Override
    public void removeCustomer(int id) {
        repository.removeCustomer(id);
    }

    @Override
    public void indexOf(String name) {
        repository.indexOf(name);
    }
}
