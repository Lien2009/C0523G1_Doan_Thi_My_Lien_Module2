package ss17.exercise.exercise1.common;


import ss17.exercise.exercise1.model.Product;
import ss17.exercise.exercise1.repository.ProductRepository;
import ss17.exercise.exercise1.service.ProductService;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static final String FILE = "C:\\Users\\mylie\\Desktop\\C0523G1_Doan_Thi_My_Lien_Module2\\C0523G1_Doan_Thi_My_Lien_Module2\\src\\ss17\\exercise\\exercise1\\common\\productbiany.dat";

    public static void writeData(String pathFile, List<Product> productsList) {
        try {
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productsList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> readData(String pathFile) {
        List<Product> products = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        List<Product> productList = productRepository.getAll();
        writeData(FILE, productList);
        List<Product> productsBinay = readData(FILE);
        for (Product parts : productsBinay) {
            System.out.println(parts);
        }
    }
}
