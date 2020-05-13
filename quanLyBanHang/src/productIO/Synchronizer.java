package productIO;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class Synchronizer {
    public static ArrayList<Product> productsList = new ArrayList<>();
    public ArrayList<Product> readToFile() {
        File inFile = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\Menu.txt");
        FileReader fileReader = null;
        BufferedReader br = null;
        String line = null;
        String[] food;
        try {
            if (!inFile.exists()) {
                throw new FileNotFoundException("File not found");
            }
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
    public void orderFood(int number) {
        File orderFile = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\Order.txt");
        try {
            if (!orderFile.exists()) {
                throw new FileNotFoundException("File not found");
            }
            FileWriter fileWriter = new FileWriter(orderFile,true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String content = null;
            for (int i=0;i<productsList.size();i++) {
                if (i==number) {
                    String id = productsList.get(i).getId();
                    String name = productsList.get(i).getName();
                    int price = productsList.get(i).getPrice();
                    String description = productsList.get(i).getDescription();
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
    public void writeToFile(ArrayList<Product> arrayList) {
        File file = new File("D:\\Codegym\\Module2-Java\\Week5\\CaseStudy\\quanLyBanHang\\Menu.txt");
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }
            FileWriter fileWriter = new FileWriter(file,true);
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
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
