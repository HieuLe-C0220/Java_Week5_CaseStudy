package view;

import controller.ProductManager;
import productIO.Synchronizer;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
//        synchronizer.orderFood(1);
//        synchronizer.orderFood(2);
//        synchronizer.orderFood(3);
//        productManager.addProduct();
        productManager.showProductList();
        productManager.deleteProduct();
        productManager.savetoFile();
//        productManager.showProductList();
    }
}
