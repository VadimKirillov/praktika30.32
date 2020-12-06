import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите quantity, name, description");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem a = new MenuItem(quantity, name, description);
        System.out.println(a.toString());

    }

}