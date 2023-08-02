package furamaResort.repository.customer;

import furamaResort.model.Customer;
import furamaResort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static final String CUSTOMER_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\customer.csv";

    @Override
    public int findId(String id) {
        List<Customer> customerList = getAll();
        int index = -1;
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                index = customerList.indexOf(customer);
            }
        }
        return index;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(CUSTOMER_FILE);
        String[] customerData = null;
        for (String string : stringList) {
            customerData = string.split(",");
            Customer customer = new Customer(customerData[0], customerData[1], customerData[2], customerData[3], customerData[4], customerData[5], customerData[6], customerData[7], customerData[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoCSV());
        ReadAndWrite.writeFile(CUSTOMER_FILE, stringList, true);
    }

    @Override
    public void edit(String id, Customer customer) {
        int i = findId(id);
        List<Customer> customerList = getAll();
        customerList.set(i, customer);
        List<String> stringList = new ArrayList<>();
        for (Customer e : customerList) {
            stringList.add(e.getInfoCSV());
        }
        ReadAndWrite.writeFile(CUSTOMER_FILE, stringList, false);
    }

    @Override
    public void delete(String id) {
        int index = findId(id);
        List<Customer> customerList = getAll();
        customerList.remove(index);
        List<String> stringList = new ArrayList<>();
        for (Customer e : customerList) {
            stringList.add(e.getInfoCSV());
        }
        ReadAndWrite.writeFile(CUSTOMER_FILE, stringList, false);
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customerList = getAll();
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().contains(name)) {
                customers.add(customerList.get(i));
            }
        }
        return customers;
    }
}
