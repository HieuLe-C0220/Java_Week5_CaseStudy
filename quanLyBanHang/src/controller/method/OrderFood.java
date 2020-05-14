package controller.method;

import model.Food;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderFood {
    public static void orderFood(ArrayList<Product> arrList) {
        List<Product> orderList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nhập số thứ tự của món khách order: ");
        int numberId = scanner.nextInt();
        for (int i = 0; i < arrList.size(); i++) {
            if (i == numberId) {
                String id = arrList.get(i).getId();
                String name = arrList.get(i).getName();
                int price = arrList.get(i).getPrice();
                String description = arrList.get(i).getDescription();
                System.out.println("Bạn đang phục vụ bàn nào?");
                String table = scanner.next();
                table = AddProduct.checkNull(scanner,table,"Cần nhập tên bàn");
                String amount = scanner.next();
                amount = AddProduct.checkNull(scanner,amount,"Cần nhập số lượng");
                Product orderProduct = new Food(table,id, name, price,Integer.parseInt(amount),description);
                orderList.add(orderProduct);
                break;
            }
        }
        for (Product product : orderList) {
            System.out.println(product.toString());
        }
    }
}