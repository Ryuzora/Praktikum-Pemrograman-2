package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    private static final String URL = "jdbc:mysql://localhost:3306/tokobukudb";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    public static boolean testConnection() {
        try (Connection conn = getConnection()) {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            System.err.println("Koneksi database gagal: " + e.getMessage());
            return false;
        }
    }
}