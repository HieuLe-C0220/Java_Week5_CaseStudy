package controller.method;

import model.Product;
import productIO.IOFile;
import productIO.ProductList;

import java.io.File;
import java.util.ArrayList;

public class Pay {
    public static void pay() {
        File orderFile = ProductList.getInstance().getOrderFile();
        IOFile ioFile = new IOFile();
        ArrayList<Product> orderList = ioFile.readToFile(orderFile);
        int sum = 0;
        for(Product order : orderList) {
            sum += order.getPrice();
        }
        System.out.println(sum);
    }
}