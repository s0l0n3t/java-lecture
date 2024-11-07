package com.swingdev.View;

import com.swingdev.Dao.UserDao;
import com.swingdev.Helper.Config;
import com.swingdev.Helper.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame{
    private JPanel panel1;
    private JPanel mainPanel;
    private JPasswordField passwordFieldRegister;
    private JTextField emailField;
    private JTextField usernameField;
    private JComboBox typeComboBox;
    private JButton buttonConfirm;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JLabel lblEmail;
    private JLabel lblType;

    public RegisterForm(){
        setContentPane(mainPanel);
        setSize(300,400);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.getCenterX(Toolkit.getDefaultToolkit().getScreenSize(),getSize()),Helper.getCenterY(Toolkit.getDefaultToolkit().getScreenSize(),getSize()));
        lblEmail.setText("Email");
        lblPassword.setText("Password");
        lblType.setText("Account type");
        lblUsername.setText("Username");
        typeComboBox.addItem("ADMIN");
        typeComboBox.addItem("MANAGER");
        typeComboBox.addItem("EMPLOYEE");
        buttonConfirm.setText("Confirm");
        setVisible(true);

        buttonConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(UserDao.createUser(usernameField.getText(),passwordFieldRegister.getText(),emailField.getText(),typeComboBox.getSelectedItem().toString())){
                    dispose();
                }
            }
        });
    }
}
