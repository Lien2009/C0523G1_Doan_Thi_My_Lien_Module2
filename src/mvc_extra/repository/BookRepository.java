package mvc_extra.repository;

import mvc_extra.model.Book;
import mvc_extra.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    public static final String BOOK_FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\mvc_extra\\book.csv";

    @Override
    public int findId(int id) {
        List<Book> books = display();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void showInfo(int id) {
        List<Book> books = display();
        int index = findId(id);
        System.out.println(books.get(index));
    }

    @Override
    public List<Book> display() {
        List<Book> bookList = new ArrayList<>();
        List<String> strings = ReadAndWrite.readFile(BOOK_FILE);
        String[] arr;
        for (String s : strings) {
            arr = s.split(",");
            Book book = new Book(Integer.parseInt(arr[0]), arr[1], arr[2], Double.parseDouble(arr[3]));
            bookList.add(book);
        }
        return bookList;
    }

    @Override
    public void add(Book book) {
        List<String> strings = new ArrayList<>();
        strings.add(book.getInfoCSV());
        ReadAndWrite.writeFile(BOOK_FILE, strings, true);
    }

    @Override
    public void delete(int id) {
        List<Book> books = display();
        int index = findId(id);
        books.remove(index);
        List<String>stringList = new ArrayList<>();
        for(Book book:books){
            stringList.add(book.getInfoCSV());
        }
        ReadAndWrite.writeFile(BOOK_FILE,stringList,false);
    }

    @Override
    public void edit(int id,Book book) {
        List<Book> books = display();
        int index = findId(id);
        books.set(index,book);
        List<String>stringList = new ArrayList<>();
        for(Book book1:books){
            stringList.add(book1.getInfoCSV());
        }
        ReadAndWrite.writeFile(BOOK_FILE,stringList,false);
    }
}
