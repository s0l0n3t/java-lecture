package com.swingdev.Model;

import com.swingdev.Helper.Config;
import com.swingdev.Helper.DBConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Person {
    private int id;
    private String name;
    private String surname;
    private int permit;
    private String type;
    private int experience;

    public enum TYPE{
        type1(30),
        type2(20),
        type3(10);
        private int personPermit;
        TYPE(int i) {
            personPermit = i;
        }
        int getPrice(){
            return personPermit;
        }
    }

    public Person(){

    }
    public Person(int id,String name,String surname,int permit,String type,int experience){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.permit = permit;
        this.type = type;
        this.experience = experience;
    }
    public Person(String name,String surname,int permit,String type,int experience){
        this.name = name;
        this.surname = surname;
        this.permit = permit;
        this.type = type;
        this.experience=experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public int getPermit() {
        return permit;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermit(int permit) {
        this.permit = permit;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setType(String type) {
        this.type = type;
    }
    public static int calculatePermit(String type,int experience){
        if(type.equals(TYPE.type1.toString())){
            return TYPE.type1.getPrice()+(experience*5);
        }
        if(type.equals(TYPE.type2.toString())){
            return TYPE.type2.getPrice()+(experience*5);
        }
        if(type.equals(TYPE.type3.toString())){
            return TYPE.type3.getPrice()+(experience*5);
        }
        return 0;
    }
}
