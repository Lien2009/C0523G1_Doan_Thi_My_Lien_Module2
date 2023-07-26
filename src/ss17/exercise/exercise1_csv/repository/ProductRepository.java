package ss17.exercise.exercise1_csv.repository;

import ss17.exercise.exercise1_csv.model.Product;
import ss17.exercise.exercise1_csv.util.ReadAndWriteChar;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss17\\exercise\\exercise1_csv\\util\\products.csv";
    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        List<String> stringList = ReadAndWriteChar.readCSV(FILE);//đọc ra console 1 list string
        String[] array = null;//tạo mảng để chứa từng string trong list, biến mỗi phần trong string thành phần tử mảng
        for (String string : stringList) {
            array = string.split(",");//biến chuỗi thành mảng
            Product product = new Product(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]), array[3], array[4]);//tạo đối tượng có các thuộc tính là phần tử của mảng
            productList.add(product);
        }
        return productList;
    }

    @Override
    public void add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToCSV());//add string để ghi ra file csv dạng string
        ReadAndWriteChar.writeCSV(FILE, stringList, true);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> product = this.getAll();
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getName().equals(name)) {
                productList.add(product.get(i));
            }
        }
        return productList;
    }
}
