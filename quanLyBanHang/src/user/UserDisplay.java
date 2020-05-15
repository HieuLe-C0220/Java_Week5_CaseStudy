package user;

public class UserDisplay {
    private static void showWelcome(){
        System.out.println("Welcome to Restaurant: Who are you?");
        System.out.println("1. Admin");
        System.out.println("2. Cashier");
        System.out.println("3. Chef");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void showMenuAdmin() {
        System.out.println("=====Menu=====");
        System.out.println("1. Show food menu");
        System.out.println("2. Find food by name");
        System.out.println("3. Add food in menu");
        System.out.println("4. Delete product by id");
        System.out.println("5. Edit food static");
        System.out.println("6. Show food order");
        System.out.println("7. Show doanh thu");
        System.out.println("0. Save and Exit");
        System.out.print("Enter your choice: ");
    }
    private static void showMenuCashier() {
        System.out.println("=====Menu=====");
        System.out.println("1. Show food menu");
        System.out.println("2. Find food by name");
        System.out.println("3. Order food");
        System.out.println("4. Show food order");
        System.out.println("5. Pay");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void showMenuChef() {
        System.out.println("=====Menu=====");
        System.out.println("1. Show food order");
        System.out.println("2. Ordered");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
}
