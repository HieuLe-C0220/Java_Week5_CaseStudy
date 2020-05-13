package controller.method;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteProduct {
    public static void deleteProduct(ArrayList<Product>arrList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id của món muốn bỏ đi: ");
        String id = sc.next();
        for (int i=0;i<arrList.size();i++) {
            if (arrList.get(i).getId().equals(id)) {
                arrList.remove(i);
                break;
            }
        }
        System.out.println("Bạn nhập sai id");
    }
}
