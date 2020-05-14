package controller.method;

import model.Product;
import productIO.ProductList;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderFood {

    public static void orderFood(ArrayList<Product> arrList) {
        File orderFile = ProductList.getInstance().getOrderFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ tự của món khách order: ");
        int numberId = scanner.nextInt();
        try {
            FileWriter fileWriter = new FileWriter(orderFile,true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String content = null;
            for (int i=0;i<arrList.size();i++) {
                if (i==numberId) {
                    String id = arrList.get(i).getId();
                    String name = arrList.get(i).getName();
                    int price = arrList.get(i).getPrice();
                    String description = arrList.get(i).getDescription();
                    content = id + ","+name+","+price+","+description;
                    bw.write(content);
                    bw.newLine();//xuống dòng
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}