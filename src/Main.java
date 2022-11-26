import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Author author = new Author("John R.R.", "Tolkien");
        //Author author1 = new Author("George R.R.", "Martin");
        Author author1 = new Author("John R.R.", "Tolkien");
        Book book = new Book("The Lord of the Ring", author, 1954);
        Book book1 = new Book("A Songs of Ice and Fire", author, 1996);

        book.setYear(1955);
        book1.setYear(1998);

        System.out.println("Название книги: " + book.getNameBook());
        System.out.println("Автор книги: " + author.getNameAuthor() + author.getLastNameAuthor());
        System.out.println("Год издания книги: " + book.getYear());
        System.out.println();
        System.out.println("Название книги: " + book1.getNameBook());
        System.out.println("Автор книги: " + author1.getNameAuthor() + author1.getLastNameAuthor());
        System.out.println("Год издания книги: " + book1.getYear());
        System.out.println();

        //Next lessons Objects

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book.equals(book1));
        System.out.println(author.equals(author1));
    }
}