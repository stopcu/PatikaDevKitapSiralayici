package stopcu.main;

import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

import stopcu.book.Book;
import stopcu.book.BookOrderPage;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("a", 123, "das", new Date());
        Book book2 = new Book("b", 343, "bfg", new Date());
        Book book3 = new Book("g", 12, "ayle", new Date());
        Book book4 = new Book("r", 24, "bdmfe", new Date());
        Book book5 = new Book("j", 74, "fksnow", new Date());

        HashSet<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        System.out.println(books.toString());

        TreeSet<Book> bookTreeSet = new TreeSet<>(new BookOrderPage());
        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);
        bookTreeSet.add(book5);
        System.out.println(bookTreeSet.toString());

    }

}
