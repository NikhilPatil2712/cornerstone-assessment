package BookStore;

public class App {
    public static void main(String[] args) {
        // Create a book shop
        Store shop = new Store();

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add book to cart
        Book book = shop.searchBookByTitle("Java Programming");
        if (book != null) {
            cart.addBookToCart(book);
        }

        // Calculate total price
        System.out.println("Total price: $" + cart.getTotalPrice());
    }
}
