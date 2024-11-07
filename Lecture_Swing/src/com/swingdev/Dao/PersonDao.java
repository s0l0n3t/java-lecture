package com.swingdev.Dao;

import com.swingdev.Helper.Config;
import com.swingdev.Helper.DBConnector;
import com.swingdev.Model.Person;

import javax.swing.table.TableRowSorter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDao {

    public static Person findPerson(String name,String surname){
        Person obj = new Person();
        String personExistSqlQuery = "SELECT * FROM employee WHERE name = ? AND surname = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(personExistSqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,surname);
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                obj = personMatch(resultSet);
            }

        } catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return obj;
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
    private static Person personMatch(ResultSet resultSet) throws SQLException{
        return new Person(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("surname"),resultSet.getInt("permit"),resultSet.getString("type"),resultSet.getInt("experience"));
    }
}
