package ss12.exercise.exercise1_mvc.repository;

import ss12.exercise.exercise1_mvc.model.Product;

public interface IProductRepository {
    void add(Product product);
    void set(int id, Product product);
    void remove(int id);
    void display();
    void search(String name);
    void sortIncrease();
    void sortDecrease();
}
