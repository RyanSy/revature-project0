package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://35.230.166.173:5432/postgres";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        return DriverManager.getConnection(url,username, password);
    }


}
