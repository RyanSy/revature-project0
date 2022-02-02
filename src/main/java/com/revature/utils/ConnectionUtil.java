package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class ConnectionUtil {

    //This will be a singleton which creates our connection to the database for us
    private static ConnectionUtil cu;

    private EnvironmentParser ep;

    private ConnectionUtil(){
        ep = new EnvironmentParser();
    }

    private String database = "schooldb";

    public static synchronized ConnectionUtil getInstance(){
        if(cu == null){
            return new ConnectionUtil();
        }
        return cu;
    }

    //Create a database connection based off of our credentials and url
    public Connection getConntection(){
        Connection con;

        Map<String, String> credentials = ep.parseVariables();

        try{
            String dbUrl = "jdbc:postgresql://" + credentials.get("DB_URL") + ":5432/" + database;
            con = DriverManager.getConnection(dbUrl, credentials.get("DB_USERNAME"), credentials.get("DB_PASSWORD"));
            System.out.println("db connected");
            return con;
        } catch (SQLException e) {
            System.out.println("error connecting to db");
            e.printStackTrace();
        }

        return null;
    }

}