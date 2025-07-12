public class EBook extends Book {
    private String fileType;

    public EBook(int isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public double buy(int need, String email, String address) {
        MailService.sendEBook(email);
        return price * need;
    }

    @Override
    public String getType() {
        return "EBook";
    }
}
