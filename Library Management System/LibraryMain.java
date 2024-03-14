import java.util.ArrayList;
import java.util.List;

public class LibraryMain {
    private List<Book> books;
    private List<User> users;

    public LibraryMain() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                    ", Genre: " + book.getGenre() + ", Availability: " + (book.isAvailable() ? "Available" : "Not Available"));
        }
    }

    public void borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            user.borrowBook(book);
            book.setAvailability(false);
            System.out.println("Book \"" + book.getTitle() + "\" has been borrowed by " + user.getName());
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is not available for borrowing.");
        }
    }

    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            book.setAvailability(true);
            System.out.println("Book \"" + book.getTitle() + "\" has been returned by " + user.getName());
        } else {
            System.out.println("User " + user.getName() + " did not borrow this book.");
        }
    }

    Iterable<User> getUsers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
