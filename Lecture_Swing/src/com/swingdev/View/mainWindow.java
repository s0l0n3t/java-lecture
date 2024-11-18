package com.swingdev.View;

import com.swingdev.Dao.PersonDao;
import com.swingdev.Helper.Config;
import com.swingdev.Helper.Helper;
import com.swingdev.Model.Person;
import com.swingdev.Model.UserPerms;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private static DefaultTableModel tblModel;
    private static int selectedItemId;


    public mainWindow(){
        setContentPane(panelAccount);
        tblModel = new DefaultTableModel();
        windowController(800,500);
        setToolText();
        buttonAccess();
        setTable(this.tblModel,this.tblPerson);
        fillTable(PersonDao.getList());

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreatePerson createPersonForm = new CreatePerson();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Example newForm = new Example();
            }
        });
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textSearch.getText().isEmpty()){
                    fillTable(PersonDao.getList());
                }
                else{
                    fillTable(textBoxFindPerson(Helper.textSplit(textSearch.getText())));
                }

            }
        });
        textSearch.addComponentListener(new ComponentAdapter() {
        });
        textSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(textPressEventHandler(e) == false){
                        e.setKeyChar('\0');
                        //add warning dialog
                }
            }
        });
        tblPerson.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if(e.getButton() == MouseEvent.BUTTON3){
                    createPopupMenu().show(e.getComponent(),e.getX(),e.getY());
                }
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
        tblModel.setColumnIdentifiers(Helper.personColumnList);
        tblPerson.setModel(tblModel);
        tblPerson.getTableHeader().setReorderingAllowed(false);
    }
    private void windowController(int width,int height){
        setSize(width,height);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(Helper.getCenterX(Toolkit.getDefaultToolkit().getScreenSize(),getSize()),Helper.getCenterY(Toolkit.getDefaultToolkit().getScreenSize(),getSize()));
    }
    public static void fillTable(ArrayList<Person> personArrayList){
        tblModel.setRowCount(0);//clear Jtable model
        for(int i =0;i< personArrayList.size();i++){
            Object[] personTableRow = new Object[Helper.personColumnList.length];
            personTableRow[0] = personArrayList.get(i).getId();
            personTableRow[1] = personArrayList.get(i).getName();
            personTableRow[2] = personArrayList.get(i).getSurname();
            personTableRow[3] = personArrayList.get(i).getPermit();
            personTableRow[4] = personArrayList.get(i).getType();
            personTableRow[5] = personArrayList.get(i).getExperience();
            tblModel.addRow(personTableRow);
        }
    }
    //regex test if u want to use.
    private int matchRegex(String input){
       Pattern pattern = Pattern.compile("\\s");
       Matcher matcher = pattern.matcher(input);
       int matches = 0;
       while (matcher.find()){
           matches++;
       }
       return matches;
    }
    private boolean textPressEventHandler(KeyEvent keyEvent){
        for(int i =0 ;i<  Helper.lowerCaseAlphabet.length;i++){
            if(keyEvent.getKeyChar() == Helper.lowerCaseAlphabet[i] || keyEvent.getKeyChar() == Helper.upperCaseAlphabet[i] || keyEvent.getKeyChar() == ' '){
                keyEvent.setKeyChar(keyEvent.getKeyChar());
                return true;
            }
        }
        return false;
    }
    private ArrayList<Person> textBoxFindPerson(ArrayList<String> textBoxArrayList){
        switch (textBoxArrayList.size()){
            case 1:
                return PersonDao.findObjectArray(textBoxArrayList.get(0));
            case 2:
                return PersonDao.findObjectArray(textBoxArrayList.get(0),textBoxArrayList.get(1));
            case 3:
                return PersonDao.findObjectArray(textBoxArrayList.get(0)+" "+textBoxArrayList.get(1),textBoxArrayList.get(2));
            default:
                return PersonDao.findObjectArray(textBoxArrayList.get(0));
        }
    }
    private JPopupMenu createPopupMenu(){
        JPopupMenu popupMenu = new JPopupMenu("table listener");
        JMenuItem delete = new JMenuItem("Delete");
        JMenuItem edit = new JMenuItem("Edit");
        popupMenu.add(delete);
        popupMenu.add(edit);
        selectedItemId = (int) tblPerson.getValueAt(tblPerson.getSelectedRow(),0);
        delete.addActionListener(e -> {
            if(PersonDao.deleteObject(getSelectedItemId())){
                Helper.messageSuccess("Delete Successfully");
            }
            else {
                Helper.messageFailed("Delete Failed");
            }
            fillTable(PersonDao.getList());
            //create form delete here
        });
        edit.addActionListener(e -> {
            CreatePerson createPersonForm = new CreatePerson();
            createPersonForm.setIsFormUpdate(true);
            createPersonForm.setTextFieldName((String) tblPerson.getValueAt(tblPerson.getSelectedRow(),1));
            createPersonForm.setTextFieldSurname((String) tblPerson.getValueAt(tblPerson.getSelectedRow(),2));
            createPersonForm.setTextFieldExperience(String.valueOf(tblPerson.getValueAt(tblPerson.getSelectedRow(),5)));
            createPersonForm.getPersonTypeCombobox().setSelectedItem((String)tblPerson.getValueAt(tblPerson.getSelectedRow(),4));//selected index
        });
        return popupMenu;
    }

    public static int getSelectedItemId() {
        return selectedItemId;
    }
}
