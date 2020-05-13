package controller.method;

import model.Product;

import java.util.ArrayList;

public class FindProduct {
    public static boolean findProduct(ArrayList<Product>arrayList,String name) {
        for (Product product : arrayList) {
            if (product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
