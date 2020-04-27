package lecture_9;

import lecture_6.Author;
import lecture_6.Book;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookCatalog<books> {
    private ArrayList<Book> books;
    public InMemoryBookCatalog() {
        books = new ArrayList<Book>();
    }
    public static void method() {
        System.out.println("Hello");
    }
    public List<Book> getAllBooksByauthor(Author author) {
        List<Book> result = new ArrayList<Book>();
        for (Book b :books) {
            if (b.getAuthor().equals(books)) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Book> getAll() {
        return books;
    }
}

