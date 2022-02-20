package introjavaws21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// database
public class QuizService {
    static final String DB_URL = "jdbc:mysql://localhost/3306/quizstart";
    static final String USER = "guest";
    static final String PASS = "guest123";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE DATABASE QUIZ";
            stmt.executeUpdate(sql);
            System.out.println("Quiz Service created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
