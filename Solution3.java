package collectionBasic;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String bookName = sc.nextLine();
            String author = sc.nextLine();
            long isbn = sc.nextLong();
            double price = sc.nextDouble();
            sc.nextLine();
           Book book = new Book(bookName,author,isbn,price);
            bookList.add(book);
        }
        System.out.println("books");
        for (Book book : bookList) {
            System.out.println(book);

        }

        Collections.sort(bookList);

        System.out.println("sorted book");
        for (Book book : bookList) {
            System.out.println(book);

        }


    }
}