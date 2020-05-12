package view;

import controller.ProductManager;
import productIO.Synchronizer;

public class Test {
    public static void main(String[] args) {
        Synchronizer synchronizer = new Synchronizer();
        ProductManager productManager = new ProductManager();
        synchronizer.readToFile();
//        synchronizer.orderFood(1);
//        synchronizer.orderFood(2);
//        synchronizer.orderFood(3);
//        productManager.addProduct();
        productManager.showProductList();
    }
}
