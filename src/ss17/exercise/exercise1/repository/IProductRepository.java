package ss17.exercise.exercise1.repository;

import ss17.exercise.exercise1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    List<Product> add(Product product);
    List<Product> search(String name);
}
