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
    private ProductController productController;


    public CreateProductWindow(){
        productController = new ProductController();
        this.add(container);
        this.setTitle("Customer Product Form");
        this.setSize(300,400);
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
        //add product method here.
        btn_createProduct.addActionListener(e -> {
            setProductObject();
        });
    }
    private void setProductObject(){
        JTextField[] textArray = {this.text_nameProduct,this.text_codeProduct,this.text_priceProduct,this.text_stockProduct};
        try {
            if(!helper.isEmptyArrayEmpty(textArray)){
                productController = new ProductController();
                int hashCode = (int) Math.ceil(Math.ceil(Integer.valueOf(text_codeProduct.getText())) + Math.ceil(Math.random()*1000));
                productController.createProduct(text_nameProduct.getText(),String.valueOf(hashCode),Integer.valueOf(text_priceProduct.getText()),Integer.valueOf(text_stockProduct.getText()));
                helper.loginSuccessful(helper.CREATETYPE.PRODUCT);
            }
            else {
                helper.emptyTextBox();
            }
        }
        catch (Exception exception){
            helper.dbError(exception);
        }
    }
}
