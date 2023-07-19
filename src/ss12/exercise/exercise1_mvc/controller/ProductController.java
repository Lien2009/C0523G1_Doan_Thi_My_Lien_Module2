package ss12.exercise.exercise1_mvc.controller;

import ss12.exercise.exercise1_mvc.service.IProductService;
import ss12.exercise.exercise1_mvc.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("PRODUCT");
            System.out.println("1.Add");
            System.out.println("2.Set");
            System.out.println("3.Remove");
            System.out.println("4.Display");
            System.out.println("5.Search");
            System.out.println("6.Sort up ascending");
            System.out.println("7.Sort descending");
            System.out.println("8.Exit");
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.set();
                    break;
                case 3:
                    productService.remove();
                    break;
                case 4:
                    productService.display();
                    break;
                case 5:
                    productService.search();
                    break;
                case 6:
                    productService.sortIncrease();
                    break;
                case 7:
                    productService.sortDecrease();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }
}
