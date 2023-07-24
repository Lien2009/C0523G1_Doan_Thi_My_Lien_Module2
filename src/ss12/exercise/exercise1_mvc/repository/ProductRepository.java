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
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList0 = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                productList0.add(productList.get(i));
            }
        }
        return productList0;
    }

    @Override
    public List<Product> sortIncrease() {
        List<Product> productList1 = new ArrayList<>(productList);
        Collections.sort(productList1, new SortAscendingByPrice());
        return productList1;
    }

    @Override
    public List<Product> sortDecrease() {
        List<Product> productList2 = new ArrayList<>(productList);
        Collections.sort(productList2, new SortDescendingByPrice());
        return productList2;
    }

    public static void main(String[] args) {
        int index = productList.indexOf(new Product(2, "Cam"));//thử ss theo id và tên
        System.out.println(index);
    }
}

