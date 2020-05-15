package controller.method;

import model.Proceeds;
import storage.ProductList;
import storage.Synchronized;

import java.util.ArrayList;

public class SortDownProceeds {
    public static void sortDownProceeds() {
        ProductList list = ProductList.getInstance();
        Synchronized sync = new Synchronized();
        sync.readToFileProceeds(list.getProceedsDay());
        ArrayList<Proceeds>arrayList = list.proceedsList;
        boolean status = true;
        for (int k = 1; k < arrayList.size() && status; k++) {
            status = false;
            for (int i = 0; i < arrayList.size() - k; i++) {
                if (arrayList.get(i).getMoney() < arrayList.get(i + 1).getMoney()) {
                    Proceeds temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    status = true;
                }
            }
        }
        System.out.println("Doanh thu theo thứ tự giảm dần: ");
        for (Proceeds proceeds : arrayList) {
            System.out.println(proceeds);
        }
    }
}
