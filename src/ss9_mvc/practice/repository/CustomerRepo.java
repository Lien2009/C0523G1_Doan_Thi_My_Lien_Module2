package ss9_mvc.practice.repository;

import ss9_mvc.model.Student;
import ss9_mvc.practice.model.Customer;

import java.util.ArrayList;

public class CustomerRepo implements ICustomerRepo {
    private static ArrayList<Customer> myCustomer = new ArrayList<>(10);
    private static int size;

    static {
        Customer customer = new Customer(1, "Liên", 20, "VIP");
        Customer customer1 = new Customer(2, "Long", 25, "None");
        Customer customer2 = new Customer(3, "Thiện", 15, "VIP");
        Customer customer3 = new Customer(4, "Hạnh", 30, "VIP");
        Customer customer4 = new Customer(5, "Linh", 30, "None");
        myCustomer.add(0, customer);
        myCustomer.add(1, customer1);
        myCustomer.add(2, customer2);
        myCustomer.add(3, customer3);
        myCustomer.add(4, customer4);
    }

    @Override
    public ArrayList<Customer> displayAll() {
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
    public void indexOf(String name) {
        for (int i = 0; i < myCustomer.size(); i++) {
            if (myCustomer.get(i).getName().contains(name)) {
                System.out.println(myCustomer.get(i));
            }
        }
    }
}


