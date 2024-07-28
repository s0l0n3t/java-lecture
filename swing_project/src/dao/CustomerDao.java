package dao;

import core.Database;
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
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Hata",JOptionPane.WARNING_MESSAGE);//print error message.

        }
        return customers;

    }
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



}
