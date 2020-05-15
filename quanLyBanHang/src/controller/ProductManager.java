package controller;

import controller.method.*;
import impl.ProductManagerAct;
import model.Food;
import model.Product;
import storage.ProductList;

import java.util.ArrayList;

public class ProductManager implements ProductManagerAct {
    private static volatile ProductManager instance;
    public synchronized static ProductManager getInstance(){
        if(instance ==null){
            instance = new ProductManager();
        }
        return instance;
    }
    ProductList listManager = ProductList.getInstance();
    private final ArrayList<Product> arrayList = listManager.productsList;
    private final ArrayList<Food> orderList = listManager.orderList;
    @Override
    public void addProduct() {
        AddProduct.addProduct(arrayList);
    }
    @Override
    public void showMenu() {
        ShowMenu.showProductList(arrayList);
    }

    @Override
    public void showOrderList() {
        ShowOrderList.showOrderList(orderList);
    }

    @Override
    public void ordered() {
        Ordered.ordered(orderList);
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
        Pay.pay(orderList);
    }

    @Override
    public void proceedsOf_day() {

    }

    @Override
    public void sortProceedsOf_day() {

    }

//    public void saveToFile() {
//        ioFile.writeToFile(arrayList,listManager.getMenuFile());
//    }
}