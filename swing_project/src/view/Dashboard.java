package view;

import business.CustomerController;
import business.ProductController;
import entity.Customer;
import entity.Product;
import entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
    private JPanel pnl_product;
    private JPanel pnl_customers;
    private JScrollPane scrl_product;
    private JTable tbl_product;
    private JTextField text_searchproduct;
    private JButton btn_searchproduct;
    private JButton btn_resetProduct;
    private JButton btn_addProduct;
    private final User user;
    private final CustomerController customerController;
    private DefaultTableModel customerTable = new DefaultTableModel();
    private DefaultTableModel productTable = new DefaultTableModel();
    private final ProductController productController;



    public Dashboard(User user){//identified.
        this.user = user;
        this.productController = new ProductController();
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

//EXIT Button
        btn_exit.addActionListener(e -> {
            this.dispose();
            mainForm mainForm = new mainForm();
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
        loadProductTable(null);

        btn_newCustomer.addActionListener(e -> {
            CreateCustomerWindow createCustomerWindow = new CreateCustomerWindow();
        });
//RESET button event
        btn_reset.addActionListener(e -> {
            loadTable(null);
            text_search.setText(null);
        });
        //SEARCH product button event
        btn_searchproduct.addActionListener(e -> {
            System.out.println(productController.searchProductByName(text_searchproduct.getText()));
            System.out.println(productController.findProducts());

            if(!text_searchproduct.getText().isEmpty()){
                loadProductTable(productController.searchProductByName(text_searchproduct.getText().toLowerCase()));
            }
            else{
                loadProductTable(null);
            }


        });
        //RESET product button event
        btn_resetProduct.addActionListener(e -> {
            loadProductTable(null);
            text_searchproduct.setText(null);
        });
        btn_addProduct.addActionListener(e -> {
            CreateProductWindow productWindow = new CreateProductWindow();
        });
        text_searchproduct.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    btn_searchproduct.doClick();
                }
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
    private void loadProductTable(ArrayList<Product> products){
        Object[] columnNames = {"id","name","code","price","stock"};
        if(products == null){
            products = this.productController.findProducts();
        }
        //Clear Table
        DefaultTableModel clearModel = (DefaultTableModel) this.tbl_product.getModel();
        clearModel.setRowCount(0);

        this.productTable.setColumnIdentifiers(columnNames);
        for(Product product: products){
            Object[] rowObject = {
                    product.getId(),
                    product.getName(),
                    product.getCode(),
                    product.getPrice(),
                    product.getStock()
            };
            this.productTable.addRow(rowObject);
        }
        this.tbl_product.setModel(productTable);
        this.tbl_product.getTableHeader().setReorderingAllowed(false);
        this.tbl_product.getColumnModel().getColumn(0).setMaxWidth(50);
        this.tbl_product.setEnabled(false);
    }
}
