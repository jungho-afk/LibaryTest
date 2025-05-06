package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("도서 추가 완료: " + book.getTitle());
    }

    public Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) return b;
        }
        return null;
    }

    public Book searchByIsbn(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) return b;
        }
        return null;
    }

    public void borrowBook(String title) {
        Book b = searchByTitle(title);
        if (b != null && b.isAvailable()) {
            b.borrow();
            System.out.println("대출 완료: " + title);
        } else {
            System.out.println("대출 불가: " + title);
        }
    }

    public void returnBook(String title) {
        Book b = searchByTitle(title);
        if (b != null && !b.isAvailable()) {
            b.returnBook();
            System.out.println("반납 완료: " + title);
        } else {
            System.out.println("반납 불가 또는 이미 반납됨");
        }
    }

    public void printAvailableBooks() {
        System.out.println("📚 대출 가능한 도서 목록:");
        for (Book b : books) {
            if (b.isAvailable()) {
                b.printInfo();
            }
        }
    }
}