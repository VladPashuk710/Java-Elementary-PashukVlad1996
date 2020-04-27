package lecture_9;

import lecture_6.Author;
import lecture_6.Book;

public interface BookCatalog {
    String letter = "A";
    void add(Book b);
    Book searchByAuthor(Author author);
    public void find();
}
