
package com.example.sastdemo;

/**
 * Main app to call vulnerable code for demo purposes.
 * Keep usage local/isolated.
 */
public class MainApp {

    public static void main(String[] args) {
        UserController uc = new UserController();
        DatabaseConfig cfg = new DatabaseConfig();
        SessionManager sm = new SessionManager();

        // Simulate calls - using simple inputs
        System.out.println("Database URL: " + cfg.getJdbcUrl());
        String session = sm.createSessionId();
        System.out.println("Generated session id (demo): " + session);

        // Demonstration input. This string is unsafe and intentionally used to trigger static analysis warnings.
        // Do NOT use in production or against live databases.
        uc.handleGetUser("' OR '1'='1"); // intentionally crafted to show concatenation risk in static scan
    }
}
