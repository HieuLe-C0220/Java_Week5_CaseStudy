package view;

import controller.ProductManager;
import storage.Synchronized;
import storage.ProductList;
import user.UserDisplay;

public class Test {
    public static void main(String[] args) {
        UserDisplay userDisplay = new UserDisplay();
        userDisplay.start();
    }
}
