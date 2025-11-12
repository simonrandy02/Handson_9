package Latihan4;

public class Book extends Product {
    private String author, isbn;
    private int pages;

    public Book(String id, String name, double price, int stock, String author, int pages, String isbn) {
        super(id, name, price, stock);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    @Override
    public void displayDetails() {
        System.out.println("[Book] " + name);
        System.out.println("Author: " + author + " | Pages: " + pages + " | ISBN: " + isbn);
        System.out.println("Price: Rp " + price + " | Stock: " + stock + "\n");
    }
}
