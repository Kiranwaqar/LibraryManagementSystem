/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

import java.sql.*;//The java.sql package contains classes and interfaces for accessing and processing data stored in a database using the Java Database Connectivity (JDBC) API.

//This class provides a method for establishing a connection to a MySQL database using JDBC.
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "Kiranwaqar2005");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
