import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Book> LIST = new LinkedList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("===========图书管理系统==========");
            System.out.println("==========1.新增图书信息==========");
            System.out.println("==========2.删除图书信息==========");
            System.out.println("==========3.查找图书信息==========");
            System.out.println("==========4.修改图书信息==========");
            switch (scanner.nextInt()){
                case 1:
                    insert(scanner);
                    break;
            }
         }
    
    }

    public static void read() throws FileNotFoundException{

    }
    public static void save() throws FileNotFoundException {
        File file = new File("Book.txt");
        FileInputStream ins = new FileInputStream(file);

    }
    public static void insert(Scanner scanner){
        String name;
        String author;
        int price;
        System.out.println("请输入书名：");
        name = scanner.nextLine();
        System.out.println("请输入作者：");
        author = scanner.nextLine();
        System.out.println("请输入价格：");
        price = scanner.nextInt();
        Book newbook = new Book(name,author,price);
        LIST.add(newbook);
    }
}
