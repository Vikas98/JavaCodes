package random;

import javax.swing.*;
import java.sql.*;

public class RetievalOfData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
                try {
                    // Load the MySQL JDBC driver
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    // Database connection details
                    String url = "jdbc:mysql://localhost:3306/";
                    String username = "root";
                    String password = ""; // No password for the root user
                    String databasename = "mp";

                    // Establish connection to MySQL server
                    Connection connection = DriverManager.getConnection(url, username, password);

                    // SQL statement for creating a database
                    String sql = "CREATE DATABASE " + databasename;

                    // Create a Statement object
                    Statement statement = connection.createStatement();

                    // Execute the SQL statement
                    statement.executeUpdate(sql);

                    // Close the statement and connection
                    statement.close();
                    connection.close();

                    // Display a message dialog indicating successful creation of the database
                    JOptionPane.showMessageDialog(null, "Database created successfully!");
                } catch(Exception e) {
                    // Handle any errors
                    e.printStackTrace();
                    // Display a message dialog indicating the error
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

            }
        }
    }