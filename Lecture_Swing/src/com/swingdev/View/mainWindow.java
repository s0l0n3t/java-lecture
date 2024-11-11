package com.swingdev.View;

import com.swingdev.Dao.PersonDao;
import com.swingdev.Helper.Config;
import com.swingdev.Helper.Helper;
import com.swingdev.Model.UserPerms;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow extends JFrame{
    private JPanel panelAccount;
    private JLabel lblAccount;
    private JLabel lblPerm;
    private JButton btnSearch;
    private JButton btnAdd;
    private JTabbedPane tabPerson;
    private JTextField textSearch;
    private JPanel pnlPerson;
    private JScrollPane scrlPerson;
    private JTable tblPerson;
    private JButton btnExit;
    private DefaultTableModel tblModel;


    public mainWindow(){
        setContentPane(panelAccount);
        windowController(800,500);
        setToolText();
        buttonAccess();
        setTable(this.tblModel,this.tblPerson);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add person form instance
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Example newForm = new Example();
            }
        });
    }
    private boolean isAddable(UserPerms userPerms){
        if(userPerms.isAdding()){
            return true;
        }
        return false;
    }
    private boolean isReadable(UserPerms userPerms){
        if(userPerms.isReading()){
            return true;
        }
        return false;
    }
    private boolean isWritable(UserPerms userPerms){
        if(userPerms.isWriting()){
            return true;
        }
        return false;
    }
    private void buttonAccess(){
        setVisible(true);
        if(isAddable(Example.userPerms)){
            btnAdd.setEnabled(true);
        }
        else{
            btnAdd.setEnabled(false);
        }
    }
    private void setToolText(){
        lblAccount.setText(" Welcome "+Example.accountObject.getUserName());
        lblPerm.setText(" "+Example.accountObject.getType());
        btnAdd.setText("    ADD    ");
        btnSearch.setText("SEARCH");
        btnExit.setText("EXIT");
    }
    private void setTable(DefaultTableModel tblModel,JTable tblPerson){
        // createModelPersonlist
        tblModel = new DefaultTableModel();
        Object[] personColumnList = {"ID","Name","Surname","Permit","Type","Experience"};
        tblModel.setColumnIdentifiers(personColumnList);
        for(int i =0;i< PersonDao.getList().size();i++){
            Object[] personTableRow = new Object[personColumnList.length];
            personTableRow[0] = PersonDao.getList().get(i).getId();
            personTableRow[1] = PersonDao.getList().get(i).getName();
            personTableRow[2] = PersonDao.getList().get(i).getSurname();
            personTableRow[3] = PersonDao.getList().get(i).getPermit();
            personTableRow[4] = PersonDao.getList().get(i).getType();
            personTableRow[5] = PersonDao.getList().get(i).getExperience();
            tblModel.addRow(personTableRow);
        }
        tblPerson.setModel(tblModel);
        tblPerson.getTableHeader().setReorderingAllowed(false);
    }
    private void windowController(int width,int height){
        setSize(width,height);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.getCenterX(Toolkit.getDefaultToolkit().getScreenSize(),getSize()),Helper.getCenterY(Toolkit.getDefaultToolkit().getScreenSize(),getSize()));

    }
}
