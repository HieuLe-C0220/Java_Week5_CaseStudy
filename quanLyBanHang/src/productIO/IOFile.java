package productIO;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class IOFile extends Product {
    public ArrayList<Product> readToFile(File inFile) {
        ProductList listManager = ProductList.getInstance();
        ArrayList<Product> productsList = listManager.productsList;
        FileReader fileReader = null;
        BufferedReader br = null;
        String line = null;
        String[] food;
        try {
            fileReader = new FileReader(inFile);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                food = line.split(",");
                Product addProduct = new Product(food[0],food[1],Integer.parseInt(food[2]),food[3]);
                productsList.add(addProduct);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Kho lưu trữ không tồn tại, bạn cần sửa lại link lưu trữ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productsList;
    }
    public void writeToFile(ArrayList<Product> arrayList,File outFile) {
        try {
            FileWriter fileWriter = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String content = null;
            for (Product newFood : arrayList) {
                String id = newFood.getId();
                String name = newFood.getName();
                int price = newFood.getPrice();
                String description = newFood.getDescription();
                content = id + "," + name + "," + price + "," + description;
                bw.write(content);
                bw.newLine();//xuống dòng
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
