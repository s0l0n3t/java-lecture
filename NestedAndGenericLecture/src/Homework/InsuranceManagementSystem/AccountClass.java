package Homework.InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;

public abstract class AccountClass {
    User userClass;
    private AuthenticationStatusEnum AuthenticationStatus;
    public ArrayList<Insurance> insuranceArrayList = new ArrayList<>();
    public AccountClass(User user){
        this.userClass = user;
        AccountManager.userTreeSet.add(this.userClass);
    }
    public final void showUserInfo(){
        System.out.printf(userClass.toString());
    }
    public enum AuthenticationStatusEnum{
        SUCCESS,
        FAIL
    }
    public AuthenticationStatusEnum login(String email,String password) {
        if(userClass.getEmail().equals(email) && userClass.getPassword().equals(password)){
            this.AuthenticationStatus = AuthenticationStatusEnum.SUCCESS;
            return AuthenticationStatusEnum.SUCCESS;
        }
        else {
            this.AuthenticationStatus = AuthenticationStatusEnum.FAIL;
            //throw new InvalidAuthenticationException();
            return AuthenticationStatusEnum.FAIL;
        }
    }
}

abstract class Insurance{
    private String name;
    private double price;
    private Date startAndEndingDate;

    public Insurance(String name,double price, Date startAndEndingDate){
        this.name = name;
        this.price = price;
        this.startAndEndingDate = startAndEndingDate;
    }
    public abstract double calculate();

    public String getName() {
        return name;
    }

    public Date getStartAndEndingDate() {
        return startAndEndingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStartAndEndingDate(Date startAndEndingDate) {
        this.startAndEndingDate = startAndEndingDate;
    }
}

class HealthInsurance extends Insurance{
    public HealthInsurance(String name, double price, Date startAndEndingDate) {
        super(name, price, startAndEndingDate);
    }

    @Override
    public double calculate(){
        this.setPrice(this.getPrice() + this.getPrice() * 0.05);
        return this.getPrice();
    }
}

class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String name, double price, Date startAndEndingDate) {
        super(name, price, startAndEndingDate);
    }

    @Override
    public double calculate() {
        this.setPrice(this.getPrice() + this.getPrice() * 0.07);
        return this.getPrice();
    }
}

class TravelInsurance extends Insurance{
    public TravelInsurance(String name, double price, Date startAndEndingDate) {
        super(name, price, startAndEndingDate);
    }

    @Override
    public double calculate() {
        this.setPrice(this.getPrice() + this.getPrice() * 0.15);
        return this.getPrice();
    }
}

class CarInsurance extends Insurance{
    public CarInsurance(String name, double price, Date startAndEndingDate) {
        super(name, price, startAndEndingDate);
    }

    @Override
    public double calculate() {
        this.setPrice(this.getPrice() + this.getPrice() * 0.25);
        return this.getPrice();
    }
}

class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Address> addressArrayList;
    private static int id = 0;

    public User(String name,String lastName,String email,String password,String job,int age){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        id++;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", addressArrayList=" + addressArrayList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddressArrayList(ArrayList<Address> addressArrayList) {
        this.addressArrayList = addressArrayList;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Address> getAddressArrayList() {
        return addressArrayList;
    }

    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }
    public void addHomeAddress(HomeAddress homeAddress){
        this.addressArrayList.add(homeAddress);
    }
    public void addBusinessAddress(BusinessAddress businessAddress){
       this.addressArrayList.add(businessAddress);
    }
    public boolean deleteAddress(Address address){
        if(this.addressArrayList.contains(address)){
            this.addressArrayList.remove(address);
            return true;
        }
        return false;
    }}

class HomeAddress implements Address{
    private String country;
    private String city;
    private static int id = 0;

    public HomeAddress(String country,String city){
        this.country = country;
        this.city = city;
        id++;
    }
    public void updateAddress(String country,String city){
        this.country = country;
        this.city = city;
    }
}

class BusinessAddress extends HomeAddress implements Address{
    public BusinessAddress(String country, String city) {
        super(country, city);
    }
}

class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(){
        super();
    }
}


