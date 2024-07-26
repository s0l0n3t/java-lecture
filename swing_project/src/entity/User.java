package entity;

public class User {
    private int id;
    private String name;
    private String mail;
    private String password;

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{"+
                "id = '"+ id +"\'" +
                ", name= '"+ name + "\'"+
                ", mail= '"+ mail + "\'"+
                ", password= '"+ password + "\'" + '}';

    }

}
