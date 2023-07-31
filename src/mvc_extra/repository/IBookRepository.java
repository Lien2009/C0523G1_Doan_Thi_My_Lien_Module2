package mvc_extra.repository;

import mvc_extra.model.Book;

import java.util.List;

public interface IBookRepository {
    int findId(int id);
    void showInfo(int id);
    List<Book> display();
    void add(Book book);
    void delete(int id);
    void edit(int id, Book book);
}
