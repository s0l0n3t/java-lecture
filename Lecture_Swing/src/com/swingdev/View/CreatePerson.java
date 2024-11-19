package com.swingdev.View;

import com.swingdev.Dao.PersonDao;
import com.swingdev.Helper.Config;
import com.swingdev.Helper.Helper;
import com.swingdev.Model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePerson extends JFrame{
    private JPanel pnlCreatePerson;
    private JTextField textFieldSurname;
    private JTextField textFieldExperience;
    private JTextField textFieldName;
    private JComboBox personTypeCombobox;
    private JButton employeeRegisterButton;
    private boolean isFormUpdate = false;

    public CreatePerson(){
        setFormTools(this.personTypeCombobox,300,400);
        setVisible(true);

        employeeRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isFormUpdate == false){
                    if(PersonDao.createObject(textFieldName.getText(),textFieldSurname.getText(),calculatePermit(),personTypeCombobox.getSelectedItem().toString(),Integer.parseInt(textFieldExperience.getText()))){
                        Helper.messageSuccess("Creating Successfully");
                        dispose();
                        mainWindow.fillTable(PersonDao.getList());
                    }
                    else {
                        Helper.messageFailed("Creating Failed");
                    }
                }
                if(isFormUpdate == true){
                    if(PersonDao.modifyObject(mainWindow.getSelectedItemId(),textFieldName.getText(),textFieldSurname.getText(),calculatePermit(),personTypeCombobox.getSelectedItem().toString(),Integer.parseInt(textFieldExperience.getText()))){
                        Helper.messageSuccess("Modify success");
                        dispose();
                        mainWindow.fillTable(PersonDao.getList());
                    }
                    else {
                        Helper.messageFailed("Modify Failed");
                    }
                }
            }
        });
    }
    private void setFormTools(JComboBox personTypeCombobox,int width,int height){
        setContentPane(pnlCreatePerson);
        setSize(width,height);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.getCenterX(Toolkit.getDefaultToolkit().getScreenSize(),getSize()),Helper.getCenterY(Toolkit.getDefaultToolkit().getScreenSize(),getSize()));
        personTypeCombobox.setModel(new DefaultComboBoxModel(new String[]{Person.TYPE.type1.name(),Person.TYPE.type2.name(),Person.TYPE.type3.name()}));

    }
    private int calculatePermit(){
        return Person.calculatePermit(personTypeCombobox.getSelectedItem().toString(),Integer.parseInt(textFieldExperience.getText()));
    }

    public JTextField getTextFieldName() {
        return textFieldName;
    }

    public JTextField getTextFieldSurname() {
        return textFieldSurname;
    }

    public void setTextFieldSurname(String textFieldSurname) {
        this.textFieldSurname.setText(textFieldSurname);
    }

    public JTextField getTextFieldExperience() {
        return textFieldExperience;
    }

    public void setTextFieldExperience(String textFieldExperience) {
        this.textFieldExperience.setText(textFieldExperience);
    }

    public void setTextFieldName(String textFieldName) {
        this.textFieldName.setText(textFieldName);
    }

    public JComboBox getPersonTypeCombobox() {
        return personTypeCombobox;
    }

    public void setPersonTypeCombobox(JComboBox personTypeCombobox) {
        this.personTypeCombobox = personTypeCombobox;
    }

    public void setIsFormUpdate(Boolean isFormUpdate){
        this.isFormUpdate = isFormUpdate;
    }
    public boolean isFormUpdate() {
        return isFormUpdate;
    }
}
