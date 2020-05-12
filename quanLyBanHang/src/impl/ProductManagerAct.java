package impl;

public interface ProductManagerAct {
    void showProductList();
    void addProduct();
    boolean editInforProduct();
    boolean deleteProduct(String name);
    boolean findProduct(String name);
    void sortProductList();
}
