package ss17.exercise.exercise1.service;

import ss17.exercise.exercise1.model.Product;
import ss17.exercise.exercise1.repository.IProductRepository;
import ss17.exercise.exercise1.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository repository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Product> getAll() {
        List<Product> productList = repository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
        return productList;
    }

    @Override
    public void add() {
        try {
            System.out.println("Enter ID:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Price:");
            double price = scanner.nextDouble();
            System.out.println("Enter Company:");
            String company = scanner.next();
            System.out.println("Enter Describe:");
            String describe = scanner.next();
            repository.add(new Product(id, name, price, company, describe));
        }catch (NumberFormatException e){
            System.out.println("Phải nhập dạng số nha");
        } catch (Exception e){
            System.out.println("Lỗi");
        }
    }

    @Override
    public void search() {
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        List<Product> products = repository.search(name);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
