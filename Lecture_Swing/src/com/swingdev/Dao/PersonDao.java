package com.swingdev.Dao;

import com.swingdev.Helper.Config;
import com.swingdev.Helper.DBConnector;
import com.swingdev.Helper.Helper;
import com.swingdev.Model.Person;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDao implements IDaoClass{

    public static Person findObject(String name,String surname){
        Person obj = new Person();
        String personExistSqlQuery = "SELECT * FROM employee WHERE name = ? AND surname = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(personExistSqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                obj = objectMatch(resultSet);
            }

        } catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return obj;
    }
    public static ArrayList<Person> findObjectArray(String name,String surname){
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person obj = new Person();
        String personExistSqlQuery = "SELECT * FROM employee WHERE name = ? AND surname = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(personExistSqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                obj = objectMatch(resultSet);
                personArrayList.add(obj);
            }

        } catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return personArrayList;
    }
    //Overloading
    public static ArrayList<Person> findObjectArray(String name){
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person obj = new Person();
        String personExistSqlQuery = "SELECT * FROM employee WHERE name = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(personExistSqlQuery);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                obj = objectMatch(resultSet);
                personArrayList.add(obj);
            }

        } catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return personArrayList;
    }
    public static boolean createObject(String name,String surname,int permit,String type, int experience){
        String personCreateSqlQuery = "INSERT INTO employee " +
                "(name," +
                "surname," +
                "permit," +
                "type," +
                "experience)" +
                "VALUES (?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(personCreateSqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            preparedStatement.setInt(3,permit);
            preparedStatement.setString(4,type);
            preparedStatement.setInt(5,experience);
            preparedStatement.executeUpdate();
        } catch (SQLException exception){
            System.out.println(exception.toString());
            return false;
        }
        return true;
    }
    public static boolean modifyObject(int id,String name, String surname,int permit, String type,int experience){
        String personModifySqlQuery =
                "UPDATE employee SET name = ?,"+
                "surname = ?," + "permit = ?," + "type = ?," + "experience = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(personModifySqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            preparedStatement.setInt(3,permit);
            preparedStatement.setString(4,type);
            preparedStatement.setInt(5,experience);
            preparedStatement.setInt(6,id);
            preparedStatement.executeUpdate();
        }catch (SQLException exception){
            System.out.println(exception.toString());
            return false;
        }
        return true;

    }
    public static boolean deleteObject(int id){
        String personDeleteSqlQuery = "DELETE FROM employee WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(personDeleteSqlQuery);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }catch (SQLException exception){
            System.out.println(exception.toString());
            return false;
        }
        return true;
    }

    public static ArrayList<Person> getList(){
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person obj;
        try {
            Statement statement = DBConnector.getInstance().createStatement();
            ResultSet rs = statement.executeQuery(Config.PERSON_LIST_QUERY);
            while (rs.next()){
                obj = new Person(rs.getInt("id"),rs.getString("name"),rs.getString("surname"),rs.getInt("permit"),rs.getString("type"),rs.getInt("experience"));
                personArrayList.add(obj);
            }
        }catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return personArrayList;
    }
    private static Person objectMatch(ResultSet resultSet) throws SQLException{
        return new Person(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("surname"),resultSet.getInt("permit"),resultSet.getString("type"),resultSet.getInt("experience"));
    }
}
