import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseManagement {
    private final String DB_URL = "jdbc:mysql://localhost/jdbclecture";
    private final String DB_USERNAME = "user";
    private final String DB_PASSWORD = "asd123";
    public Connection connection = null;
    public Statement varSt = null;

    public DatabaseManagement() throws SQLException {
        System.out.println();
    }
    public Connection connectDatabase(){
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        }catch (SQLException exception){
            System.out.println("SQLException : "+ exception.getMessage());
        }
        return connection;
    }
    public ArrayList<UserClass> getTable(Connection connection){
        ArrayList<UserClass> userClassArrayList = new ArrayList<>();
        try {
            varSt = connection.createStatement();
            ResultSet stResultSet = varSt.executeQuery("SELECT * FROM lecturedb");
            while (stResultSet.next()){
//                System.out.println("id: "+stResultSet.getInt("id"));
//                System.out.println("username: "+ stResultSet.getString("username"));
//                System.out.println("password: "+ stResultSet.getString("password"));
                userClassArrayList.add(new UserClass(stResultSet.getInt("id"),stResultSet.getString("username"),stResultSet.getString("password"),stResultSet.getString("email")));
            }
        }catch (SQLException exception){
            System.out.println("SQLException : "+ exception.getMessage());
        }
        return userClassArrayList;
    }
    public void addUser(Connection connection,UserClass userClass){
        String sqlQuery = "INSERT INTO lecturedb (username,password,email) VALUES ('"+userClass.getUsername()+"','"+userClass.getPassword()+"','"+userClass.getEmail()+"')";
        try {
            varSt = connection.createStatement();
            //varSt.executeUpdate("INSERT INTO lecturedb (username,password,email) VALUES ("+userClass.getUsername()+","+userClass.getPassword()+","+userClass.getEmail()+")");
            varSt.executeUpdate(sqlQuery);
        }catch (SQLException exception){
            System.out.println("SQLException : "+ exception.getMessage());
        }
    }
    public void addUserPrepared(Connection connection,UserClass userClass){
        String sqlQuery = "INSERT INTO lecturedb (username,password,email) " +
                "VALUES (?,?,?)";
        try {
            varSt = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,userClass.getUsername());
            preparedStatement.setString(2,userClass.getPassword());
            preparedStatement.setString(3,userClass.getEmail());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (SQLException exception){
            System.out.println("SQLException : "+ exception.getMessage());
        }
    }
    public boolean removeUserPrepared(Connection connection,UserClass userClass){

        String sqlQuery = "DELETE FROM lecturedb WHERE username = ? AND password = ?";
        try {
            if(isThereUser(connection,userClass)){
                varSt = connection.createStatement();
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.setString(1,userClass.getUsername());
                preparedStatement.setString(2,userClass.getPassword());
                preparedStatement.executeUpdate();
                varSt.close();
                return true;
            }

        }catch (Exception exception){
            System.out.println("SQLException : "+exception.getMessage());
        }
        return false;
    }
    public boolean isThereUser(Connection connection,UserClass userClass){
        String sqlQuery = "SELECT * FROM lecturedb WHERE username = ? AND password = ?";
        try {
            varSt = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, userClass.getUsername());
            preparedStatement.setString(2, userClass.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            varSt.close();
            return resultSet.next();
        }catch (SQLException exception){
            System.out.println("SQLException : "+exception.getMessage());
            return false;
        }
    }
}
class UserClass{
    private int id;
    private String username;
    private String password;
    private String email;

    public UserClass(int id, String username, String password, String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}