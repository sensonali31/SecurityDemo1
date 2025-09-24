
package com.example.sastdemo;

/**
 * Intentional hardcoded credentials example for demo purposes.
 */
public class DatabaseConfig {

    // WARNING: Hardcoded credential for demonstration only.
    // SpotBugs / FindSecBugs will flag this as hardcoded password.
    public static final String DB_USERNAME = "admin";
    public static final String DB_PASSWORD = "admin123";

    public static String getJdbcUrl() {
        return "jdbc:h2:mem:prod-db";
    }
}
