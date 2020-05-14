package productIO;

import model.Product;

import java.io.File;
import java.util.ArrayList;

public class ProductList extends Product {
    public ArrayList<Product> productsList = new ArrayList<>();
    private ProductList() {
    }
    private static volatile ProductList instance;
    public synchronized static ProductList getInstance() {
        if (instance==null) {
            instance = new ProductList();
        }
        return instance;
    }
    public File getMenuFile() {
        return menuFile;
    }
    public File getOrderFile() {
        return orderFile;
    }
    private File menuFile = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\src\\productIO\\Menu.txt");
    private File orderFile = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\src\\productIO\\Order.txt");
//    private File proceedsFile = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\src\\productIO\\Proceeds.txt");
}
