public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Book paper1 = new PaperBook(123, "Game of thrones", 2002, 50.0, "george R. R. Martin", 10);
        Book ebook1 = new EBook(456, "Harry Potter", 2000, 30.0, "J. K. Rowling", "PDF");
        Book demo1 = new DemoBook(789, "Machine Learning", 2015, "Alan Turing");

        inventory.addBook(paper1);
        inventory.addBook(ebook1);
        inventory.addBook(demo1);

        inventory.listBooks();

        //Buy a paper book
        double amount1 = inventory.buyBook(123, 2, "user@example.com", "Address1");

        // Buy an ebook
        double amount2 = inventory.buyBook(456, 1, "user@example.com", "");

        // test exceptions
        inventory.buyBook(789, 1, "user@example.com", "Address2");
        inventory.buyBook(000, 1, "user@example.com", "Address3");
        inventory.buyBook(123, 5, "user@example.com", "Address4");

        //Remove outdated books
        inventory.removeOutdatedBooks(2025, 10);

        System.out.println("\nFinal Inventory:\n");
        inventory.listBooks();
    }
}