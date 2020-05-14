package controller.method;

import model.Food;

import java.util.ArrayList;

public class Ordered {
    public static void ordered(ArrayList<Food>foodArrayList) {
        if (foodArrayList.size()==0) {
            System.out.println("Chưa có gì để làm!");
        } else {
            int sum = foodArrayList.get(0).getPrice() * foodArrayList.get(0).getAmount();
            foodArrayList.remove(0);
        }
    }
}
