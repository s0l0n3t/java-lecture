package dao;

import core.Database;
import core.helper;
import entity.Customer;
import entity.User;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDao {
    private final Connection connection;


    public CustomerDao(){
        this.connection = Database.getInstance();
    }
//SEARCH by id from DB
    public Customer getById(int id){
        Customer customer = new Customer();
        String sqlQuery = "SELECT * FROM customer WHERE id = ?";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                customer = this.matchDB(resultSet);
            }
        }
        catch (Exception exception){
            helper.dbError(exception);
        }
        return customer;
    }

    public ArrayList<Customer> findCustomer(){
        ArrayList<Customer> customers = new ArrayList<>();
        String sqlQuery = "SELECT * FROM customer WHERE 1";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customers.add(this.matchDB(resultSet));
            }
        }
        catch (Exception exception){
            helper.dbError(exception);
        }
        return customers;

    }
//DB matcher
    public Customer matchDB(ResultSet resultSet) throws SQLException {
        Customer customer = new Customer();
        customer.setId(resultSet.getInt("id"));
        customer.setName(resultSet.getString("name"));
        customer.setMail(resultSet.getString("mail"));
        customer.setAddress(resultSet.getString("address"));
        customer.setPhone(resultSet.getString("phone"));
        customer.setType(Customer.TYPE.valueOf(resultSet.getString("type")));
        return customer;

    }
//ADD Customer Method
    public Customer addCustomer(String name, Customer.TYPE type,String phone,String mail,String address){
        Customer customerObject = new Customer();
        String sqlQuery = "INSERT INTO customer (name," +
                " type, " +
                " phone," +
                " mail," +
                " address)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,type.toString());
            preparedStatement.setString(3,phone);
            preparedStatement.setString(4,mail);
            preparedStatement.setString(5,address);
            preparedStatement.executeUpdate();
        }
        catch (Exception exception){
            helper.dbError(exception);
        }
        return customerObject;

    }



}
