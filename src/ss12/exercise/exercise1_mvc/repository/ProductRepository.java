package ss12.exercise.exercise1_mvc.repository;

import ss12.exercise.exercise1_mvc.comparator.SortAscendingByPrice;
import ss12.exercise.exercise1_mvc.comparator.SortDescendingByPrice;
import ss12.exercise.exercise1_mvc.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Táo", 15000, 50));
        productList.add(new Product(3, "Lê", 25000, 100));
        productList.add(new Product(2, "Cam", 10000, 30));
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void set(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(id);
            }
        }
    }

    @Override
    public void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void sortIncrease() {
        SortAscendingByPrice ascending = new SortAscendingByPrice();
        Collections.sort(productList, ascending);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortDecrease() {
        SortDescendingByPrice descending = new SortDescendingByPrice();
        Collections.sort(productList, descending);
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
