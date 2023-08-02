package furamaResort.repository.customer;

import furamaResort.model.Customer;


import java.util.List;

public interface ICustomerRepository {
    int findId(String id);
    List<Customer> getAll();

    void add(Customer customer);

    void edit(String id, Customer customer);

    void delete(String id);

    List<Customer> search(String name);
}
