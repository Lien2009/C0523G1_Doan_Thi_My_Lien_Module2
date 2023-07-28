package furamaResort;

import furamaResort.model.Customer;
import furamaResort.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Nhap {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("KH-1000","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
        customerList.add(new Customer("KH-1111","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
        customerList.add(new Customer("KH-2111","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
        System.out.println(customerList.get(0).getId().equals("KH-1000"));
        System.out.println(customerList.get(0).getId().equals("KH-1001"));
        int index = -1;
        for (Customer customer:customerList) {
            if (customer.getId().equals("KH-111")) {
                index = customerList.indexOf(customer);
            }
        }
        System.out.println(index);;

        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals("KH-1001")) {
                flag = true;
                customerList.set(i, new Customer("KH-2222","Hanh","15","F","123456788","0123123123","sd","sd","sd"));
                break;
            }
        }

        if(flag == false) {
            System.out.println("Not found");

        } else {
            System.out.println(customerList.get(0));
        }

    }
}
