package com.swingdev.Helper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private Connection connect = null;


    private Connection connectMysql(String DB_URL,String DB_USERNAME, String DB_PASSWORD){
        try {
            this.connect = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        }
        catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return this.connect;
    }

    public static Connection getInstance(){
        DBConnector dbConnector = new DBConnector();
        return dbConnector.connectMysql(Config.DB_URL,Config.DB_USERNAME,Config.DB_PASSWORD);
    }
}
