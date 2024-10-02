package it2c.demoapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Config {

    private Connection connect() {
       
        String url = "jdbc:sqlite:grading_system.db"; 
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }

    public void addRecord(String sql, String courseName, String courseCode, String instructor, int credits) {
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

          
            pstmt.setString(1, courseName);
            pstmt.setString(2, courseCode);
            pstmt.setString(3, instructor);
            pstmt.setInt(4, credits);
            
          
            pstmt.executeUpdate();
            System.out.println("Course added successfully!");

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
