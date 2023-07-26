package ss17.exercise.exercise1.controller;

import ss17.exercise.exercise1.model.Product;
import ss17.exercise.exercise1.service.IProductService;
import ss17.exercise.exercise1.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void showMenu() {
        IProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("PRODUCT");
            System.out.println("1. Get All");
            System.out.println("2. Add new product");
            System.out.println("3. Search product by name");
            System.out.println("4. Exit");
            System.out.println("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    service.getAll();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.search();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
