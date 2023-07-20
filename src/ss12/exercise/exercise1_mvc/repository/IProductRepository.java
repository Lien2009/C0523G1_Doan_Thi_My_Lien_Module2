package ss12.exercise.exercise1_mvc.repository;

import ss12.exercise.exercise1_mvc.model.Product;

import java.util.List;

public interface IProductRepository {
    void add(Product product);
    void set(int id, Product product);
    void remove(int id);
    List<Product> getAll();
    List<Product> search(String name);
    List<Product> sortIncrease();
    List<Product> sortDecrease();
}
