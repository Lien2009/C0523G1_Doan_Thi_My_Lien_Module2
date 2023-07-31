package mvc_extra.service;

import mvc_extra.model.Book;
import mvc_extra.repository.BookRepository;
import mvc_extra.repository.IBookRepository;

import java.util.List;
import java.util.Scanner;

public class BookService implements IBookService {
    IBookRepository repository = new BookRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Book> bookList = repository.display();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Override
    public void add() {
        try {
            int id;
            do {
                System.out.println("Enter ID:");
                id = Integer.parseInt(scanner.nextLine());
                if (repository.findId(id) != -1) {
                    System.out.println("Đã tồn tại!");
                }
            } while (repository.findId(id) != -1);
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter author:");
            String author = scanner.nextLine();
            System.out.println("Enter price:");
            double price = Double.parseDouble(scanner.nextLine());
            Book book = new Book(id, name, author, price);
            repository.add(book);
        } catch (NumberFormatException e) {
            System.out.println("Nhập dạng số!");
        }
    }

    @Override
    public void delete() {
        try {
            int id;
            do {
                System.out.println("Enter ID:");
                id = Integer.parseInt(scanner.nextLine());
                if (repository.findId(id) == -1) {
                    System.out.println("Có đâu mà xóa!");
                }
            } while (repository.findId(id) == -1);
            repository.showInfo(id);
            System.out.println("Có muốn xóa ko? Yes/No");
            String choose = scanner.nextLine();
            if (choose.equals("Yes")) {
                repository.delete(id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập dạng so!");
        }
    }

    @Override
    public void edit() {
        try {
            int id;
            do {
                System.out.println("Enter ID:");
                id = Integer.parseInt(scanner.nextLine());
                if (repository.findId(id) == -1) {
                    System.out.println("Có đâu mà sửa");
                }
            } while (repository.findId(id) == -1);
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter author:");
            String author = scanner.nextLine();
            System.out.println("Enter price:");
            double price = Double.parseDouble(scanner.nextLine());
            Book book = new Book(id, name, author, price);
            repository.edit(id, book);
        } catch (NumberFormatException e) {
            System.out.println("Nhập dạng số!");
        }
    }
}
