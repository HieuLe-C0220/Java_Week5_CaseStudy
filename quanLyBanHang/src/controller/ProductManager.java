package controller;

import impl.ProductManagerAct;
import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductManagerAct {
    private ArrayList<Product> list= new ArrayList<>();
    public void addProduct() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap ten sp");
        String newName = scanner.next();

    }

    @Override
    public void showProductList() {

    }

    @Override
    public boolean editInforProduct() {
        return false;
    }

    @Override
    public boolean deleteProduct(String name) {
        return false;
    }

    @Override
    public boolean findProduct(String name) {
        return false;
    }

    @Override
    public void sortProductList() {

    }
}