package ss17.exercise.exercise1.service;

import ss17.exercise.exercise1.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    void add();
    void search();
}
