package ss9_mvc.practice.repository;

import ss9_mvc.model.Student;
import ss9_mvc.practice.SortByCustomerType;
import ss9_mvc.practice.model.Customer;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerRepo implements ICustomerRepo {
    private static ArrayList<Customer> myCustomer = new ArrayList<>(10);

    static {
        myCustomer.add(new Customer(1, "Liên", 20, "VIP"));
        myCustomer.add(new Customer(2, "Long", 20, "None"));
        myCustomer.add(new Customer(3, "Thiện", 15, "VIP"));
    }

    @Override
    public ArrayList<Customer> displayAll() {
        Collections.sort(myCustomer);
        return myCustomer;
    }

    @Override
    public void add(Customer e) {
        myCustomer.add(e);
    }

    @Override
    public void removeCustomer(int id) {
        for (int i = 0; i < myCustomer.size(); i++) {
            if (myCustomer.get(i).getId() == id) {
                myCustomer.remove(i);
                break;
            }
        }
    }

    @Override
    public void findByName(String name) {
        for (int i = 0; i < myCustomer.size(); i++) {
            if (myCustomer.get(i).getName().contains(name)) {
                System.out.println(myCustomer.get(i));
            }
        }
    }

    @Override
    public void sortByCustomerType() {
        SortByCustomerType sortByCustomerType = new SortByCustomerType();
        Collections.sort(myCustomer, sortByCustomerType);
    }
}


