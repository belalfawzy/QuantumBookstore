public class PaperBook extends Book {
    private int quantity;

    public PaperBook(int isbn, String title, int year, double price, String author, int quantity) {
        super(isbn, title, year, price, author);
        this.quantity = quantity;
    }

    @Override
    public boolean isAvailable() {
        return quantity > 0;
    }

    @Override
    public double buy(int need, String email, String address) {
        try {
            if (quantity < need) {
                throw new RuntimeException("the book with isbn :" + isbn + "have not enough quantity");
            }
            quantity -= need;
            ShippingService.sendPaperBook(address);
            return price * need;
        }
        catch (RuntimeException ex){
            System.out.println(ex.getMessage());
            return 0.0;
        }
    }

    @Override
    public String getType() {
        return "Paper Book";
    }
}
