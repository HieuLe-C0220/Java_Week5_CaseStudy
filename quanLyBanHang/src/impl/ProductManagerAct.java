package impl;

public interface ProductManagerAct {
    void showProductList();
    void addProduct();
    void editInforProduct();
    void deleteProduct(String id);
    boolean findProduct(String name);
    void sortProductList();
}
