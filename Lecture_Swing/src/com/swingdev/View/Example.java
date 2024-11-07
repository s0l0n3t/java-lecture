package com.swingdev.View;

import com.swingdev.Dao.PermsDao;
import com.swingdev.Dao.UserDao;
import com.swingdev.Helper.Config;
import com.swingdev.Helper.Helper;
import com.swingdev.Model.User;
import com.swingdev.Model.UserPerms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField usernameField;
    private JLabel textId;
    private JPasswordField passwordField;
    private JButton button2;
    private JLabel textPassword;
    private JButton buttonRegister;
    private JButton button1;
    private JCheckBox checkBoxPasswordHide;
    private JButton btnShowPassword;
    public static UserPerms userPerms;
    public static User accountObject;

    public Example(){
        setContentPane(wrapper);
        setSize(360,160);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.getCenterX(Toolkit.getDefaultToolkit().getScreenSize(),getSize()),Helper.getCenterY(Toolkit.getDefaultToolkit().getScreenSize(),getSize()));
        setVisible(true);
        textId.setText("ID");
        textPassword.setText("Password");
        button2.setText("Login");
        buttonRegister.setText("Register");
        btnShowPassword.setText("*");


        setResizable(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println();
                if(UserDao.findUser(usernameField.getText(),passwordField.getText()).getEmail() != null){
                    accountObject = UserDao.findUser(usernameField.getText(),passwordField.getText());
                    userPerms = PermsDao.getPerms(UserDao.findUser(usernameField.getText(),passwordField.getText()).getType());
                    Helper.messageLoginSuccess();
                    dispose();
                    mainWindow mainWindow = new mainWindow();
                }
                else {
                    Helper.messageLoginFailed();
                }
            }
        });
        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterForm registerForm = new RegisterForm();
            }
        });


        btnShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//password show and hide button action
                if (passwordField.getEchoChar() == ((char) 8226)){
                    passwordField.setEchoChar((char) 0);
                }
                else {
                    passwordField.setEchoChar((char) 8226);
                }
            }
        });
    }
}
class Main  {
    public static void main(String[] args) {
        Example firstPanel = new Example();
//        for(int i =0;i<Person.getList().size();i++){
//            System.out.println(Person.getList().get(i).getId());
//            System.out.println(Person.getList().get(i).getName());
//            System.out.println(Person.getList().get(i).getSurname());
//            System.out.println(Person.getList().get(i).getPermit());
//            System.out.println(Person.getList().get(i).getType());
//            System.out.println(Person.getList().get(i).getExperience());
//        }
    }
}