package furamaResort.repository.customerRepo;

import furamaResort.model.Customer;
import furamaResort.model.Employee;
import furamaResort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static final String CUSTOMER_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\furamaResort\\data\\customer.csv";

    @Override
    public int findId(String id) {
        List<Customer> customerList = display();
        int index = -1;
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                index = customerList.indexOf(customer);
            }
        }
        return index;
    }

    @Override
    public List<Customer> display() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFile(CUSTOMER_FILE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
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
        List<Customer> customerList = display();
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
        List<Customer> customerList = display();
        customerList.remove(index);
        List<String> stringList = new ArrayList<>();
        for (Customer e : customerList) {
            stringList.add(e.getInfoCSV());
        }
        ReadAndWrite.writeFile(CUSTOMER_FILE, stringList, false);
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customerList = display();
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equals(name)) {
                customers.add(customerList.get(i));
            }
        }
        return customers;
    }
}
