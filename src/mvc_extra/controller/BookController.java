package mvc_extra.controller;

import mvc_extra.service.BookService;
import mvc_extra.service.IBookService;

import java.util.Scanner;

public class BookController {
    public static void showMenu() {
        IBookService service = new BookService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---BOOK---");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Edit");
            System.out.println("5.Exit");
            System.out.println("Enter number:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    service.display();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.delete();
                    break;
                case 4:
                    service.edit();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
