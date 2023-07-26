package ss17.exercise.exercise1_csv.service;

import ss17.exercise.exercise1_csv.model.Product;
import ss17.exercise.exercise1_csv.repository.IProductRepository;
import ss17.exercise.exercise1_csv.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository repository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void getAll() {
        List<Product> productList = repository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        try {
            System.out.println("Enter ID:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Price:");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter Company:");
            String company = scanner.nextLine();
            System.out.println("Enter Describe:");
            String describe = scanner.nextLine();
            repository.add(new Product(id, name, price, company, describe));
        } catch (NumberFormatException e) {
            System.out.println("Phải nhập dạng số nha");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
    }

    @Override
    public void search() {
        System.out.print("Enter Name:");
        String name = scanner.nextLine();
        List<Product> products = repository.search(name);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
