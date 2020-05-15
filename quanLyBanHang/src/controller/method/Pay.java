package controller.method;

import model.Food;
import java.util.ArrayList;
import java.util.Scanner;

public class Pay {
    public static void pay(ArrayList<Food>arrList) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bàn nào cần thanh toán?");
        String table = sc.next();
        int sum = 0;
        for (int i=0;i<arrList.size();i++) {
            if (table.equals(arrList.get(i).getTable())) {
                sum += arrList.get(i).getPrice() * arrList.get(i).getAmount();
            }
        }
        System.out.println("Bàn này tổng hết: "+sum);
    }
}