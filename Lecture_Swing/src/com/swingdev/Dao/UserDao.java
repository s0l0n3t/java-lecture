package com.swingdev.Dao;
import com.swingdev.Helper.Config;
import com.swingdev.Helper.DBConnector;
import com.swingdev.Helper.Helper;
import com.swingdev.Model.User;

import javax.swing.plaf.nimbus.State;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao implements IDaoClass{
    public static User findObject(String username,String password){
        User obj = new User();
        String userExistSqlQuery = "SELECT * FROM user WHERE username = ? AND password = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(userExistSqlQuery);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                obj = objectMatch(resultSet);
            }

        }catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return obj;
    }
    public static ArrayList<User> getList(){
        User obj;
        ArrayList<User> userArrayList = new ArrayList<>();
        try {
            Statement statement = DBConnector.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(Config.USER_LIST_QUERY);
            while (resultSet.next()){
                obj = new User(resultSet.getInt("id"),resultSet.getNString("username"),resultSet.getNString("password"),resultSet.getNString("email"),resultSet.getString("type"));
                userArrayList.add(obj);
            }
        } catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return userArrayList;
    }
    public static Boolean createObject(String username,String password,String email,String type) {
        String userCreateSqlQuery = "INSERT INTO user " +
                "(username," +
                " password," +
                " email," +
                " type)" +
                " VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(userCreateSqlQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, type);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.toString());
            return false;
        }
        return true;
    }
    private static User objectMatch(ResultSet resultSet)throws SQLException {
        return new User(resultSet.getInt("id"),resultSet.getNString("username"),resultSet.getNString("password"),resultSet.getNString("email"),resultSet.getString("type"));
    }
}
