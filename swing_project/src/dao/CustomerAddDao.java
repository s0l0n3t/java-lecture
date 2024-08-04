package dao;

import core.Database;
import entity.Customer;


import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class CustomerAddDao {

    private final Connection connection;


    public CustomerAddDao(){
        this.connection = Database.getInstance();
    }

    public Customer addCustomer(String name, Customer.TYPE type,String phone,String mail,String address){
        Customer customerObject = new Customer();
        String sqlQuery = "INSERT INTO customer (name, type, phone, mail, address)"
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
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Hata",JOptionPane.WARNING_MESSAGE);//print error message.

        }
        return customerObject;

    }

}
