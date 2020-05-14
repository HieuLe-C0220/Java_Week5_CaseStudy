package controller;

import controller.method.*;
import impl.ProductManagerAct;
import model.Product;
import productIO.ProductList;
import productIO.IOFile;

import java.io.File;
import java.util.ArrayList;

public class ProductManager implements ProductManagerAct {
    private IOFile ioFile = new IOFile();
    ProductList listManager = ProductList.getInstance();
    private final ArrayList<Product> arrayList= listManager.productsList;
    @Override
    public void addProduct() {
        AddProduct.addProduct(arrayList);
    }
    @Override
    public void showProductList() {
        ShowProductList.showProductList(arrayList);
    }

    @Override
    public void editInformationProduct() {
        EditInformationProduct.editInformationProduct(arrayList);
    }

    @Override
    public void deleteProduct() {
        DeleteProduct.deleteProduct(arrayList);
    }

    @Override
    public void findProduct() {
        FindProduct.findProduct(arrayList);
    }

    @Override
    public void orderFood() {
        OrderFood.orderFood(arrayList);
    }

    @Override
    public void pay() {
        Pay.pay();
    }

    @Override
    public void proceedsOf_day() {

    }

    @Override
    public void sortProceedsOf_day() {

    }

    public void saveToFile() {
        ioFile.writeToFile(arrayList,listManager.getMenuFile());
    }
}