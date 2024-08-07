package dao;

import core.Database;
import core.helper;
import entity.Product;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao {
    private final Connection connection;

    public ProductDao(){
        this.connection = Database.getInstance();
    }

    //search db by name
    public ArrayList<Product> searchProductByName(String name){
        ArrayList<Product> product = new ArrayList<>();
        String sqlQ = "SELECT * FROM product WHERE name = ?";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sqlQ);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                product.add(this.matchDB(resultSet));
            }
        }
        catch (Exception exception){
            helper.dbError(exception);
        }
        return product;
    }
    public  ArrayList<Product> searchAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        String sqlQ = "SELECT * FROM product WHERE 1";
        try{
            PreparedStatement preparedStatement = this.connection.prepareStatement(sqlQ);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                products.add(this.matchDB(resultSet));
            }
        }
        catch (Exception exception){
            helper.dbError(exception);
        }
        return products;
    }
    public Product matchDB(ResultSet resultSet) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setCode(resultSet.getString("code"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        return product;
    }
//Add product
    public Product createProduct(String name,String code,int price,int stock){
        Product product = new Product();
        String sqlQuery = "INSERT INTO product " +
                "(name," +
                " code," +
                " price," +
                " stock)" +
                " VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,code);
            preparedStatement.setInt(3,price);
            preparedStatement.setInt(4,stock);
            preparedStatement.executeUpdate();
        }
        catch (Exception exception){
            helper.dbError(exception);
        }
        return product;
    }
}
