package view;

import business.CustomerController;
import core.helper;
import entity.Customer;
import javax.swing.*;
import java.awt.*;

public class CreateCustomerWindow extends JFrame{
    private JPanel container;
    private JTextField text_Name;
    private JComboBox comboBox_Type;
    private JTextField text_Phone;
    private JTextField text_Mail;
    private JTextField text_Address;
    private JButton btn_Create;
    private JButton btn_Cancel;
    private final CustomerController customerController;
    private final Customer customer;
    private Customer.TYPE comboBox_Object;

    public CreateCustomerWindow(){
        this.customerController = new CustomerController();
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


        btn_Create.addActionListener(e -> {
            setCustomerObject(customerController);
        });
        btn_Cancel.addActionListener(e -> {
            if (helper.warningSure() == 0){
                this.dispose();
            }
        });
    }


    private void setCustomerObject(CustomerController customerController){
        JTextField[] textArray = {this.text_Name,this.text_Address,this.text_Mail,this.text_Phone};
        if(!helper.isEmptyArrayEmpty(textArray)){
            if(this.comboBox_Type.getSelectedItem().equals("PERSON")){
                comboBox_Object = Customer.TYPE.PERSON;
            }
            else{
                comboBox_Object = Customer.TYPE.COMPANY;
            }
            customerController.addCustomer(this.text_Name.getText(),this.comboBox_Object,this.text_Phone.getText(),this.text_Mail.getText(),this.text_Address.getText());
            helper.loginSuccessful(helper.CREATETYPE.CUSTOMER);
        }
        else {
           helper.emptyTextBox();
        }
    }
}
