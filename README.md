# LibraryManagementSystem
Description:
The Library Management System (LMS) is a Java-based application designed to manage the operations of a library. It provides functionalities for managing book issuance, returns, user registration, and book management. This project utilizes JDBC (Java Database Connectivity) to connect to a MySQL database for storing and retrieving library data.

Setup and Running the Project Locally:
Prerequisites:
-Java Development Kit (JDK) installed on your system
-MySQL Server installed and running
-MySQL Connector/J library (JDBC driver) added to your project dependencies

Steps:
-Clone or Download the Project Repository:
If you haven't already, navigate to the project repository on GitHub.
Click on the "Code" button and select "Download ZIP" to download the project as a ZIP file.
Extract the contents of the ZIP file to a location on your local machine.
-Import the Project into Your Java IDE:
Open your preferred Java IDE (IntelliJ IDEA, Eclipse, or NetBeans).
Choose to import the project as a Maven project if available. This will automatically handle dependencies.
Navigate to the location where you extracted the project files and select the root folder of the project.
-Ensure MySQL Server is Running:
If you don't have MySQL installed, you can download and install it from the official MySQL website: MySQL Downloads
Follow the installation instructions for your operating system.
Once MySQL is installed, make sure the MySQL server is running on your local machine.
-Configure ConnectionProvider.java:
Locate the ConnectionProvider.java file in the project. It is in the Assignment1 package.
Open the ConnectionProvider.java file in your IDE.
Update the JDBC URL, username, and password in the getConnection() method to match your MySQL database configuration.
Save the changes.
-Run the Project:
With MySQL running and the connection settings updated, run the project in your IDE.
This should start the application and open the main GUI form of the Library Management System.
You should now be able to interact with the system, adding books, managing users, and performing other library management tasks through the GUI.

Key Features and Functionalities Implemented:
-Menu-Driven Interface:
A menu-driven interface provides a structured and intuitive way for librarians to interact with the system.
Librarians are presented with a menu listing various tasks they can perform, such as adding books, adding users, displaying books, issuing books, returning books, etc.
This interface simplifies navigation and ensures that librarians can easily access and utilize the system's functionalities.

-Adding Books and Users:
Librarians can add new books to the library system by entering relevant details such as book ID, title, author, and genre.
Similarly, librarians can add new users to the system by providing details such as user ID, name, and contact information.
This functionality ensures that the library system stays up-to-date with the addition of new books and users, allowing for effective management of library resources.

-Displaying Books:
The system allows librarians to view the list of available books in the library.
Librarians can quickly access information about each book, including its title, author, genre, and availability status.
Displaying books provides librarians with valuable insights into the library's inventory, helping them in managing stock levels.

-Borrowing/Checking Out Books:
Librarians can facilitate the process of borrowing or checking out books to users.
When a user requests to borrow a book, the librarian can verify its availability and proceed with the borrowing process if the book is available.This functionality ensures smooth and efficient book lending processes, enhancing the user experience and promoting effective library services.

-Returning Books:
Users are provided with the ability to return borrowed books through the system.
Upon returning a book, the system updates the availability status of the book, making it available for other users to borrow.
This feature streamlines the book return process, ensuring that borrowed books are promptly returned to the library and ready for circulation to other patrons.




