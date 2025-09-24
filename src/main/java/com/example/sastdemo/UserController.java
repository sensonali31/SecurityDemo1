
package com.example.sastdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Intentional SQL injection example for demo purposes.
 * WARNING: Do NOT run this against production systems.
 */
public class UserController {

    // Simulate a web endpoint handler that takes a userId parameter (as string)
    public void handleGetUser(String userId) {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // NOTE: This is intentionally insecure: direct concatenation of user input into SQL
            //String query = "SELECT * FROM users WHERE id = " + userId;
            connection = getConnection();
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users WHERE id = " + userId);

            while (rs.next()) {
                // process result (omitted)
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception ignore) {}
            try { if (stmt != null) stmt.close(); } catch (Exception ignore) {}
            try { if (connection != null) connection.close(); } catch (Exception ignore) {}
        }
    }

    private Connection getConnection() throws Exception {
        // For demo purposes we return a connection string that may not be valid in your environment.
        // You can replace this with a local test DB URL if desired.
        String url = "jdbc:h2:mem:testdb";
        String user = "sa";
        String pass = "";
        return DriverManager.getConnection(url, user, pass);
    }
}
