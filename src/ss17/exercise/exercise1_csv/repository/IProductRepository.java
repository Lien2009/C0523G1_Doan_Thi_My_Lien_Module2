package ss17.exercise.exercise1_csv.repository;

import ss17.exercise.exercise1_csv.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void add(Product product);
    List<Product> search(String name);
}
