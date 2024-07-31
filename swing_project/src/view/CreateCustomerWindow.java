package view;

import business.CustomerAddController;
import core.helper;
import entity.Customer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CreateCustomerWindow extends JFrame{
    private JPanel container;
    private JTextField text_Name;
    private JComboBox comboBox_Type;
    private JTextField text_Phone;
    private JTextField text_Mail;
    private JTextField text_Address;
    private JButton btn_Create;
    private JButton btn_Cancel;
    private final CustomerAddController customerAddController;
    private final Customer customer;
    private Customer.TYPE comboBox_Object;

    public CreateCustomerWindow(){
        this.customerAddController = new CustomerAddController();
        this.customer = new Customer();
        this.add(container);
        this.setTitle("Customer Creating Form");
        this.setSize(500,400);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width)/2;//center of monitor   x
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height)/2;//center of monitor y
        this.setLocation(x,y);
        this.setResizable(false);//resizable function
        this.setVisible(true);
        this.comboBox_Type.addItem("PERSON");
        this.comboBox_Type.addItem("COMPANY");
        //Max limit for phonetext

        btn_Create.addActionListener(e -> {
            setCustomerObject(customerAddController);
        });
        btn_Cancel.addActionListener(e -> {
            int warning =JOptionPane.showConfirmDialog(null, "Çıkmak istediğinize emin misiniz ?", "Warning", JOptionPane.YES_NO_OPTION);
            if (warning == 0){
                this.dispose();

            }
        });
    }

    private void setCustomerObject(CustomerAddController customerAddController){
        JTextField[] textArray = {this.text_Name,this.text_Address,this.text_Mail,this.text_Phone};
        if(!helper.isEmptyArrayEmpty(textArray)){
            if(this.comboBox_Type.getSelectedItem().equals("PERSON")){
                comboBox_Object = Customer.TYPE.PERSON;
                System.out.println(comboBox_Type.toString());
            }
            else{
                comboBox_Object = Customer.TYPE.COMPANY;
            }
            customerAddController.addCustomer(this.text_Name.getText(),this.comboBox_Object,this.text_Phone.getText(),this.text_Mail.getText(),this.text_Address.getText());
        }
        else {
            JOptionPane.showMessageDialog(null,"Lütfen boş bırakmayınız !","Hata",JOptionPane.WARNING_MESSAGE);
        }
    }
}
