package controller.method;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class EditInformationProduct {
    public static void editInformationProduct(ArrayList<Product>arrayList) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nhập Id món muốn sửa thông tin:");
        String id = sc.next();
        for (Product product : arrayList) {
            if (id.equals(product.getId())) {
                System.out.println("Nhập các dữ liệu sửa:");

                System.out.println("Nhập id");
                String newId = sc.next();
                newId = AddProduct.checkNull(sc,newId,"Bạn cần nhập id");
                product.setId(newId);

                System.out.println("Nhập tên");
                String newName = sc.next();
                newName = AddProduct.checkNull(sc,newName,"Bạn cần nhập name");
                product.setName(newName);

                System.out.println("Nhập giá");
                String newPrice = sc.next();
                newPrice = AddProduct.checkNull(sc,newPrice,"Bạn cần nhập price");
                product.setPrice(Integer.parseInt(newPrice));

                System.out.println("Nhập mô tả");
                String newDescription = sc.next();
                newDescription = AddProduct.checkNull(sc,newDescription,"Bạn cần nhập description");
                product.setDescription(newDescription);
            }
        }
    }
}
