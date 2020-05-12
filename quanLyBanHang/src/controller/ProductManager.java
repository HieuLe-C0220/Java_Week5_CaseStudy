package controller;

import impl.ProductManagerAct;
import model.Product;
import productIO.Synchronizer;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductManagerAct {
    private ArrayList<Product> arrayList= new ArrayList<>();
    private final Synchronizer synchronizer = new Synchronizer();
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã id:");
        String newId = scanner.nextLine();
        System.out.println("Nhập tên món mới:");
        String newName = scanner.nextLine();
        System.out.println("Nhập đơn giá:");
        String newPrice = scanner.nextLine();
        System.out.println("Sản phẩm loại:");
        String newStatus = scanner.nextLine();
        Product newProduct = new Product(newId,newName,Integer.parseInt(newPrice),Integer.parseInt(newStatus));
        arrayList.add(newProduct);
        synchronizer.addFoods(arrayList);
    }
    @Override
    public void showProductList() {
        arrayList = synchronizer.readToFile();
        if (arrayList.isEmpty()) {
            System.out.println("Menu chưa có gì, cần thêm thực đơn vào!");
        } else {
            for (Product thisProduct : arrayList) {
                System.out.println(thisProduct.getId() +
                        "," + thisProduct.getName() +
                        "," + thisProduct.getPrice() +
                        "," + thisProduct.getStatus());
            }
        }
    }

    @Override
    public void editInforProduct() {
    }

    @Override
    public void deleteProduct(String id) {
        arrayList = synchronizer.readToFile();
        for (int i=0;i<arrayList.size();i++) {
            if (arrayList.get(i).getId().equals(id)) {
                arrayList.remove(i);
            }
        }
    }

    @Override
    public boolean findProduct(String name) {
        arrayList = synchronizer.readToFile();
        for (Product product : arrayList) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void sortProductList() {

    }
}