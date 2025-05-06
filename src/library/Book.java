package library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.isAvailable = true; // 처음엔 대출 가능
    }

    // Getter & Setter
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getYear() { return year; }
    public boolean isAvailable() { return isAvailable; }

    public void borrow() { isAvailable = false; }
    public void returnBook() { isAvailable = true; }

    public void printInfo() {
        System.out.println(title + " / " + author + " / " + isbn + " / " + year +
                " / " + (isAvailable ? "대출 가능" : "대출 중"));
    }
}