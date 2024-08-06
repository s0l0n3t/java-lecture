package view;

import business.ProductController;

import javax.swing.*;
import core.helper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProductWindow extends JFrame{
    private JPanel container;
    private JTextField text_nameProduct;
    private JTextField text_codeProduct;
    private JTextField text_priceProduct;
    private JTextField text_stockProduct;
    private JButton btn_createProduct;
    private JButton btn_cancel;
    private final ProductController productController;


    public CreateProductWindow(){
        productController = new ProductController();
        this.add(container);
        this.setTitle("Customer Product Form");
        this.setSize(500,400);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width)/2;//center of monitor   x
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height)/2;//center of monitor y
        this.setLocation(x,y);
        this.setResizable(false);//resizable function
        this.setVisible(true);





        btn_cancel.addActionListener(e -> {
            if(helper.warningSure() == 0){
                this.dispose();
            }

        });
        btn_createProduct.addActionListener(e -> {
            //add product method here.
        });
    }
}
