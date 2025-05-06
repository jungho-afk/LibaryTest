package library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("자바 입문", "홍길동", "123456", 2020);
        Book b2 = new Book("스프링 부트", "박둘리", "789101", 2022);

        lib.addBook(b1);
        lib.addBook(b2);

        lib.printAvailableBooks();

        lib.borrowBook("자바 입문");
        lib.printAvailableBooks();

        lib.returnBook("자바 입문");
        lib.printAvailableBooks();
    }
}