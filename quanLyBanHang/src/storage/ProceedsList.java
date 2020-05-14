package storage;

import model.Product;

import java.io.File;
import java.util.ArrayList;

public class ProceedsList extends Product {
    public ArrayList<Product> orderList = new ArrayList<>();
    private ProceedsList() {
    }
    private static volatile ProceedsList instance;
    public synchronized static ProceedsList getInstance() {
        if (instance==null) {
            instance = new ProceedsList();
        }
        return instance;
    }
//    public File getOrderDetail() {
//        return orderDetail;
//    }
    public File getProceeds_Day() {
        return proceeds_Day;
    }
//    private File orderDetail = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\src\\productIO\\order_Detail.txt");
    private File proceeds_Day = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\src\\productIO\\Proceeds_Day.txt");
}