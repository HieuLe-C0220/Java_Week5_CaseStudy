package controller;

import controller.method.AddProduct;
import controller.method.DeleteProduct;
import controller.method.FindProduct;
import controller.method.ShowProductList;
import impl.ProductManagerAct;
import model.Product;
import productIO.Synchronizer;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductManagerAct {
    Scanner scanner = new Scanner(System.in);
    private Synchronizer synchronizer = new Synchronizer();
    private ArrayList<Product> arrayList= synchronizer.readToFile();
    public void addProduct() {
        AddProduct.addProduct(arrayList);
    }
    @Override
    public void showProductList() {
        ShowProductList.showProductList(arrayList);
    }

    @Override
    public void editInforProduct() {
    }

    @Override
    public void deleteProduct() {
        DeleteProduct.deleteProduct(arrayList);
    }

    @Override
    public void findProduct() {
        String name = scanner.nextLine();
        FindProduct.findProduct(arrayList,name);
    }

    @Override
    public void sortProductList() {
    }
    public void savetoFile() {
        synchronizer.writeToFile(arrayList);
    }
}