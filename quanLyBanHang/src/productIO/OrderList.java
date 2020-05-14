package productIO;

import model.Product;

import java.io.File;
import java.util.ArrayList;

public class OrderList extends Product {
    public ArrayList<Product> orderList = new ArrayList<>();
    private OrderList() {
    }
    private static volatile OrderList instance;
    public synchronized static OrderList getInstance() {
        if (instance==null) {
            instance = new OrderList();
        }
        return instance;
    }
    public File getOrderFile() {
        return orderFile;
    }
    private File orderFile = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\src\\productIO\\Order.txt");
}