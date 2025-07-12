public abstract class Book {
    protected int isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(int isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public abstract boolean isAvailable();

    public abstract double buy(int quantity, String email, String address);

    public abstract String getType();

    public void printDetails() {
        System.out.println("----- Book Details -----");
        System.out.println("book type: " + getType() + "\nTitle: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nISBN: " + isbn);
    }
}
