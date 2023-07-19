package ss12.exercise.exercise1_mvc.service;

import ss12.exercise.exercise1_mvc.model.Product;
import ss12.exercise.exercise1_mvc.repository.IProductRepository;
import ss12.exercise.exercise1_mvc.repository.ProductRepository;
import ss9_mvc.practice.service.ICustomerService;

import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng tồn kho:");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price, quantity);
        productRepository.add(product);
    }

    @Override
    public void set() {
        System.out.println("Nhập ID sp cần sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng tồn kho:");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price, quantity);
        productRepository.set(id, product);
    }

    @Override
    public void remove() {
        System.out.println("Nhập ID sp cần xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.remove(id);
    }

    @Override
    public void display() {
        productRepository.display();
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sp tìm kiếm:");
        String name = scanner.nextLine();
        productRepository.search(name);
    }

    @Override
    public void sortIncrease() {
        productRepository.sortIncrease();
    }


    @Override
    public void sortDecrease() {
        productRepository.sortDecrease();
    }
}
