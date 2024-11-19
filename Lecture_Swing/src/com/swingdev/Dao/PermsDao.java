package com.swingdev.Dao;

import com.swingdev.Helper.DBConnector;
import com.swingdev.Model.UserPerms;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PermsDao implements IDaoClass{
    public static UserPerms findObject(String name){
        UserPerms obj = new UserPerms();
        String userPermsExistSqlQuery = "SELECT * FROM authority WHERE name = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(userPermsExistSqlQuery);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                obj = objectMatch(resultSet);
            }

        } catch (SQLException exception){
            System.out.println(exception.toString());
        }
        return obj;
    }

    private static UserPerms objectMatch(ResultSet resultSet) throws SQLException {
        return new UserPerms(resultSet.getBoolean("writing"),resultSet.getBoolean("reading"),resultSet.getBoolean("adding"));
    }
}
