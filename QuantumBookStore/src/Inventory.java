import java.util.*;

public class Inventory {
    private Map<Integer, Book> books;

    public Inventory() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Book " + book.title + " Added Successfully");
    }

    public void removeOutdatedBooks(int currentYear, int maxAge) {
        Iterator<Map.Entry<Integer, Book>> it = books.entrySet().iterator();
        while (it.hasNext()) {
            Book b = it.next().getValue();
            if (currentYear - b.getYear() > maxAge) {
                it.remove();
                System.out.println(b.title + " book removed because it is outdated book");
            }
        }
    }

    public double buyBook(int isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        try {
            if (book == null) {
                throw new RuntimeException("Book not found");
            }
            if (!book.isAvailable()) {
                throw new RuntimeException("Book not available");
            }
            return book.buy(quantity, email, address);
        }
        catch(RuntimeException ex){
            System.out.println(ex.getMessage());
            return 0.0;
        }
    }

    public void listBooks() {
        for (Book b : books.values()) {
            b.printDetails();
        }
    }
}
