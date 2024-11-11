package com.swingdev.View;

import com.swingdev.Dao.PersonDao;
import com.swingdev.Helper.Config;
import com.swingdev.Helper.Helper;
import com.swingdev.Model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class CreatePerson extends JFrame{
    private JPanel pnlCreatePerson;
    private JTextField textFieldSurname;
    private JTextField textFieldExperience;
    private JTextField textFieldName;
    private JComboBox personTypeCombobox;
    private JButton employeeRegisterButton;

    public CreatePerson(){
        setFormTools(this.personTypeCombobox,300,400);
        setVisible(true);

        employeeRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(PersonDao.createObject(textFieldName.getText(),textFieldSurname.getText(),calculatePermit(),personTypeCombobox.getSelectedItem().toString(),Integer.parseInt(textFieldExperience.getText()))){
                    Helper.messageSuccess("Creating Successfully");
                    dispose();
                    mainWindow mainWindowForm = new mainWindow();
                }
                else {
                    Helper.messageFailed("Creating Failed");
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
}
