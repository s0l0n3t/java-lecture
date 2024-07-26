package core;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    //singleton design
    private Connection connection = null;
    private static Database dataIns = null;
    private final String DB_URL = "jdbc:mysql://localhost:3306/userdata";
    private final String DB_USERNAME = "user";
    private final String DB_PASSWORD = "asd123";

    private Database(){
        try {
            this.connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Connection getConnection() {
        return connection;
    }
    public static Connection getInstance(){
        try {
            if (dataIns == null || dataIns.getConnection().isClosed()) {
                dataIns = new Database();
            }
            
            
        } catch (Exception e) {
            
        }
        return dataIns.getConnection();
    }

}
