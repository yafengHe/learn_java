package bookstore;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书的价格");
        double price = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请出示您的会员卡");
        int identity = scanner1.nextInt();

        BookStore bookStore = new BookStore();
        bookStore.buyBook(price, identity);
    }
}
