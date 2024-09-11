package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Book> books;

    public Store() {
        // Create books
        this.books = new ArrayList<>();
        books.add(new Book("Java Programming", "Author A", 29.99));
        books.add(new Book("Data Structures", "Author B", 35.50));
        books.add(new Book("Algorithms", "Author C", 40.00));
    }

    public Book searchBookByTitle(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Return null if no book is found
    }
}
