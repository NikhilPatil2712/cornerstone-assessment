package BookStore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> cart;
    private double totalPrice;

    public ShoppingCart() {
        this.cart = new ArrayList<Book>();
        this.totalPrice = 0;
    }

    public void addBookToCart(Book book) {
        cart.add(book);
        totalPrice += book.getPrice();
    }

    public double getTotalPrice() {
        // double total = 0;
        // for (Book book : cart) {
        // if (book != null) {
        // total += book.getPrice();
        // }
        // }

        return totalPrice;
    }
}
