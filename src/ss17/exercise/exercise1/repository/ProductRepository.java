package ss17.exercise.exercise1.repository;

import ss17.exercise.exercise1.common.ReadAndWriteFile;
import ss17.exercise.exercise1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Cake", 5.5, "ABC", "New"));
        productList.add(new Product(2, "Candy", 3, "ABC", "New"));
        productList.add(new Product(3, "Coca", 5.5, "COCA", "Old"));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public List<Product> add(Product product) {
        List<Product> additionProducts = new ArrayList<>(productList);
        additionProducts.add(product);
        return additionProducts;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> product = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                product.add(productList.get(i));
            }
        }
        return product;
    }
}
