package view;

import business.CustomerController;
import entity.Customer;
import entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.ArrayList;
import java.util.Objects;

public class Dashboard extends JFrame{
    private JPanel container;
    private JLabel label_welcome;
    private JButton btn_exit;
    private JTabbedPane tab_menu;
    private JPanel pnl_customer;
    private JScrollPane scrl_customer;
    private JTable tbl_customer;
    private JTextField text_search;
    private JButton btn_search;
    private JButton btn_reset;
    private JButton btn_newCustomer;
    private final User user;
    private final CustomerController customerController;
    private DefaultTableModel customerTable = new DefaultTableModel();



    public Dashboard(User user){//identified.
        this.user = user;
        this.customerController = new CustomerController();
        if(user == null) JOptionPane.showMessageDialog(null,"Kullanıcı yok !","Hata",JOptionPane.WARNING_MESSAGE);
        this.label_welcome.setText("Hoşgeldiniz "+user.getName());
        this.add(container);
        this.setTitle("Dashboard");
        this.setSize(800,400);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width)/2;//center of monitor   x
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height)/2;//center of monitor y
        this.setLocation(x,y);
        this.setResizable(false);//resizable function
        this.setVisible(true);
        btn_exit.addActionListener(e -> {
            dispose();
            mainForm mainForm = new mainForm();//Exit button working

        });

        btn_search.addActionListener(e -> {
                    Customer customer = new Customer();
                    for(int i = 0;i<customerTable.getRowCount();i++){
                        System.out.println(customerTable.getValueAt(i,1));
                        if(customerTable.getValueAt(i,1).toString().equals(text_search.getText().toString())){
                            ArrayList<Customer> searchCustomer = new ArrayList<>();
                            customer.setId((Integer) customerTable.getValueAt(i,0));
                            customer.setName((String) customerTable.getValueAt(i,1));
                            customer.setType((Customer.TYPE) customerTable.getValueAt(i,2));
                            customer.setPhone((String) customerTable.getValueAt(i,3));
                            customer.setMail((String) customerTable.getValueAt(i,4));
                            customer.setAddress((String) customerTable.getValueAt(i,5));
                            searchCustomer.add(customer);
                            loadTable(searchCustomer);
                            System.out.println(searchCustomer);

                        }
                        if(text_search.getText().trim().isEmpty()){
                            loadTable(null);
                        }


                    }


        });


        text_search.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    btn_search.doClick();
                }
            }
        });
        loadTable(null);

        btn_newCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateCustomerWindow createCustomerWindow = new CreateCustomerWindow();
            }
        });
    }

    private void loadTable(ArrayList<Customer> customers){
        Object[] columnTable = {"ID","Customer Name","Type","Mobile Phone","E-mail","Address"};
        if(customers == null){
            customers = this.customerController.findCustomer();
        }
        //Clear Table
        DefaultTableModel clearModel = (DefaultTableModel) this.tbl_customer.getModel();
        clearModel.setRowCount(0);


        this.customerTable.setColumnIdentifiers(columnTable);
        for(Customer customer: customers){
            Object[] rowObject = {
                    customer.getId(),
                    customer.getName(),
                    customer.getType(),
                    customer.getPhone(),
                    customer.getMail(),
                    customer.getAddress()
            };
            this.customerTable.addRow(rowObject);
        }
        this.tbl_customer.setModel(customerTable);
        this.tbl_customer.getTableHeader().setReorderingAllowed(false);
        this.tbl_customer.getColumnModel().getColumn(0).setMaxWidth(50);
        this.tbl_customer.setEnabled(false);

    }


}
