import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Цена название описание");
        int price = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem menuItem = new MenuItem(price, name, description);


        File file = new File("C:\\Users\\vadim\\Desktop\\prak32.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(String.valueOf(menuItem));
        writer.flush();
        writer.close();
        FileReader fr = new FileReader(file);
        char [] a = new char[100];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив

        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими

        fr.close();




    }
}