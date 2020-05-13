package controller.method;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class AddProduct {
    public static void addProduct(ArrayList<Product>arrayList) {
        System.out.println("Nhập mã id:");
        Scanner scanner = new Scanner(System.in);
        String newId = scanner.next();
        System.out.println("Nhập tên món mới:");
        String newName = scanner.nextLine();
        System.out.println("Nhập đơn giá:");
        String newPrice = scanner.next();
        System.out.println("Sản phẩm loại:");
        String newDescription = scanner.nextLine();
        Product newProduct = new Product(newId,newName,Integer.parseInt(newPrice),newDescription);
        arrayList.add(newProduct);
    }
}
