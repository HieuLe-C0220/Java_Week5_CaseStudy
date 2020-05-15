package view;

import controller.ProductManager;
import storage.Synchronized;
import storage.ProductList;

public class Test {
    public static void main(String[] args) {
        Synchronized aSynchronized = new Synchronized();
        ProductManager productManager = new ProductManager();
        ProductList list = ProductList.getInstance();
        aSynchronized.readToFileMenu(list.getMenuFile());
        productManager.sortDownProceedsOf_day();
//        productManager.orderFood();
//        productManager.orderFood();
//        productManager.orderFood();
//        productManager.showOrderList();
//        productManager.pay();
//        productManager.ordered();
//        productManager.showOrderList();
//        productManager.orderFood();
//        productManager.addProduct();
//        productManager.editInformationProduct();
//        productManager.findProduct();
//        productManager.deleteProduct();
//        productManager.saveToFile();
//        productManager.showProductList();
    }
}
