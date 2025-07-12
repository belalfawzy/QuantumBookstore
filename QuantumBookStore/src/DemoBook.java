public class DemoBook extends Book {
    public DemoBook(int isbn, String title, int year, String author) {
        super(isbn, title, year, 0.0, author);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public double buy(int need, String email, String address) {
        System.out.println("Demo books is not for sale.");
        return 0.0;
    }

    @Override
    public String getType() {
        return "Demo Book";
    }
}
