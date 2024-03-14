import java.util.ArrayList;
import java.util.List;

public class User {
    private int userID;
    private String name;
    private String contactInfo;
    private List<Book> borrowedBooks;

    public User(int userID, String name, String contactInfo) {
        this.userID = userID;
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters
    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
