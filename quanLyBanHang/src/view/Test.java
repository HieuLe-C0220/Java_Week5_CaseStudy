package view;

import controller.ProductManager;
import storage.Synchronized;
import storage.ProductList;

public class Test {
    public static void main(String[] args) {
        Synchronized aSynchronized = new Synchronized();
        ProductManager productManager = new ProductManager();
        ProductList list = ProductList.getInstance();
        aSynchronized.readToFile(list.getMenuFile());
//        productManager.pay();
        productManager.orderFood();
//        productManager.orderFood();
//        productManager.addProduct();
//        productManager.editInformationProduct();
//        productManager.findProduct();
//        productManager.deleteProduct();
//        productManager.saveToFile();
//        productManager.showProductList();
    }
}
