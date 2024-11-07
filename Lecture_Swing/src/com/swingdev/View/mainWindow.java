package com.swingdev.View;

import com.swingdev.Helper.Config;
import com.swingdev.Helper.Helper;

import javax.swing.*;
import java.awt.*;

public class mainWindow extends JFrame{
    private JPanel panelAccount;
    private JLabel lblAccount;
    private JLabel lblPerm;
    private JPanel pnlPerm;
    private JTable table1;
    private JButton btnSearch;
    private JButton btnAdd;

    public mainWindow(){
        setContentPane(panelAccount);
        setSize(1200,800);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.getCenterX(Toolkit.getDefaultToolkit().getScreenSize(),getSize()),Helper.getCenterY(Toolkit.getDefaultToolkit().getScreenSize(),getSize()));
        lblAccount.setText("Welcome \n"+Example.accountObject.getUserName());
        lblPerm.setText("Account Type : \n"+Example.accountObject.getType());
        btnAdd.setText("ADD");
        btnSearch.setText("SEARCH");
        setVisible(true);

    }
}
