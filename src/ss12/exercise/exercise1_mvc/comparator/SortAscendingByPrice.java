package ss12.exercise.exercise1_mvc.comparator;

import ss12.exercise.exercise1_mvc.model.Product;

import java.util.Comparator;

public class SortAscendingByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
