package synchronization;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class Synchronizer {
    public static ArrayList<Product> productsList = new ArrayList<>();
    public void readToFile() {
        File inFile = new File("D:\\Codegym\\Module2-Java\\Week4\\ChuabaiModuleGiuaKi\\Menu.txt");
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
                Product addProduct = new Product(food[0],food[1],Integer.parseInt(food[2]),Integer.parseInt(food[3]),food[4]);
                productsList.add(addProduct);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeToFile(int number) {
        File orderFile = new File("D:\\Codegym\\Module2-Java\\Week4\\ChuabaiModuleGiuaKi\\Order.txt");
        try {
            if (!orderFile.exists()) {
                throw new FileNotFoundException("File not found");
            }
            FileWriter fileWriter = new FileWriter(orderFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            String content = null;
            for (int i=0;i<productsList.size();i++) {
                if (i==number) {
                    String id = productsList.get(i).getId();
                    String name = productsList.get(i).getName();
                    int price = productsList.get(i).getPrice();
                    int status = productsList.get(i).getStatus();
                    String description = productsList.get(i).getDescription();
                    content = id + ","+name+","+price+","+status+","+description;
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
