package dao;
import core.Database;
import entity.User;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final Connection connection;


    public UserDao(){
        this.connection = Database.getInstance();
    }
    public User findLogin(String mail, String password){
        User userObject = new User();
        String sqlQuery = "SELECT * FROM user WHERE mail = ? AND password = ?";
       try {
           PreparedStatement preparedStatement = this.connection.prepareStatement(sqlQuery);
           preparedStatement.setString(1,mail);
           preparedStatement.setString(2,password);
           ResultSet resultSet = preparedStatement.executeQuery();
           if (resultSet.next()) {
               userObject = this.matchDB(resultSet);
           }
       }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage(),"Hata",JOptionPane.WARNING_MESSAGE);//print error message.

       }
        return userObject;

        }
        public static User matchDB(ResultSet resultSet) throws SQLException {
            User userObject = new User();
            userObject.setId(resultSet.getInt("id"));
            userObject.setName(resultSet.getString("name"));
            userObject.setPassword(resultSet.getString("password"));
            userObject.setMail(resultSet.getString("mail"));
            return userObject;

    }
}
