package com.swingdev.Model;

public class User  {
    private int id;
    private String userName;
    private String password;
    private String email;
    private String  type;


    public enum TYPE{
        ADMIN,
        MANAGER,
        EMPLOYEE
    }
    public User(){

    }
    public User(int id,String userName,String password,String email,String type){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.type = userType(type);
    }
    public User(String userName,String password,String email,String type){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.type = userType(type);
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

    public String getUserName() {
        return userName;
    }

    public void setType(String type) {
        this.type = userType(type);
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    private String userType(String type){
        if(type.toUpperCase().equals(TYPE.ADMIN.toString())  || type.toUpperCase().equals( TYPE.EMPLOYEE.toString()) || type.toUpperCase().equals(TYPE.MANAGER.toString())){
            return type.toUpperCase();
        } else {
            return null;
        }
    }//Control method
    private void setPerms(String type){
        //set perms
    }
}
