package controller.method;

import model.Proceeds;
import storage.Synchronized;

import java.util.ArrayList;
import java.util.Scanner;

public class Proceeds_Day {
    public static void proceedsDay() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        File orderFile = ProductList.getInstance().getOrderFile();
        Synchronized ioFile = new Synchronized();
//        ArrayList<Product> orderList = ioFile.readToFile(orderFile);
        ArrayList<Proceeds> proceedsList = new ArrayList<>();
        int sum = 0;
//        for(Product order : orderList) {
//            sum += order.getPrice();
        }
//        System.out.println("Hôm nay ngày mấy?");
//        String day = sc.next();
//        Proceeds proceeds_day = new Proceeds(day, sum);
//        proceedsList.add(proceeds_day);
//        ioFile.writeToFile(proceedsList, ProceedsList.getInstance().getProceeds_Day());
//        System.out.println(sum);
//    }
}