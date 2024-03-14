/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryMain library = new LibraryMain();

        while (true) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Display Books");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Search Books by Title");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    Book book = new Book(bookID, title, author, genre);
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int userID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact Information: ");
                    String contactInfo = scanner.nextLine();
                    User user = new User(userID, name, contactInfo);
                    library.addUser(user);
                    System.out.println("User added successfully.");
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter User ID: ");
                    int borrowUserID = scanner.nextInt();
                    System.out.print("Enter Book Title: ");
                    scanner.nextLine(); // Consume newline
                    String borrowBookTitle = scanner.nextLine();
                    User borrowUser = null;
                    for (User u : library.getUsers()) {
                        if (u.getUserID() == borrowUserID) {
                            borrowUser = u;
                            break;
                        }
                    }
                    if (borrowUser != null) {
                        Book borrowBook = library.findBookByTitle(borrowBookTitle);
                        if (borrowBook != null) {
                            library.borrowBook(borrowUser, borrowBook);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter User ID: ");
                    int returnUserID = scanner.nextInt();
                    System.out.print("Enter Book Title: ");
                    scanner.nextLine(); // Consume newline
                    String returnBookTitle = scanner.nextLine();
                    User returnUser = null;
                    for (User u : library.getUsers()) {
                        if (u.getUserID() == returnUserID) {
                            returnUser = u;
                            break;
                        }
                    }
                    if (returnUser != null) {
                        Book returnBook = library.findBookByTitle(returnBookTitle);
                        if (returnBook != null) {
                            library.returnBook(returnUser, returnBook);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Book Title: ");
                    String searchTitle = scanner.nextLine();
                    Book searchBook = library.findBookByTitle(searchTitle);
                    if (searchBook != null) {
                        System.out.println("Book found - Title: " + searchBook.getTitle() +
                                ", Author: " + searchBook.getAuthor() + ", Genre: " + searchBook.getGenre() +
                                ", Availability: " + (searchBook.isAvailable() ? "Available" : "Not Available"));
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
 
