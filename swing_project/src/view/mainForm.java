package view;

import core.helper;
import business.UserController;
import entity.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame{
    private JPanel container;
    private JPanel pnl_top;
    private JTextField text_pass;
    private JTextField text_mail;
    private JPanel pnl_bottom;
    private JButton btn_submit;
    private UserController userController;

    public mainForm(){
        this.userController = new UserController();
        this.add(container);
        this.setTitle("Customer Form App");
        this.setSize(400,200);
        this.setVisible(true);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width)/2;//center of monitor   x
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height)/2;//center of monitor y
        this.setLocation(x,y);
        this.setResizable(false);//resizable function
        UIManager.put("OptionPane.okButtonText","Tamam");//Ok button -> Tamam
        //Button check as array.
        btn_submit.addActionListener(e -> {
            JTextField[] textArray = {this.text_mail,this.text_pass};
            if(helper.isEmptyArrayEmpty(textArray)){
                JOptionPane.showMessageDialog(null,"E-Mail yada şifreyi boş bıraktınız.","Hata",JOptionPane.WARNING_MESSAGE);
            }

            else{
                if(!helper.isEmailValid(this.text_mail.getText().toString())) JOptionPane.showMessageDialog(null,"E-Mail biçimi hatalı","Hata",JOptionPane.WARNING_MESSAGE);
                else{
                    User user = this.userController.findLogin(text_mail.getText(),text_pass.getText());
                    if(user.getName() == null){
                        JOptionPane.showMessageDialog(null,"Böyle bir kullanıcı yok !","Hata",JOptionPane.WARNING_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Giriş başarılı !"+" Hoşgeldiniz, "+user.getName(),"Başarılı !",JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(user.toString());
                        this.dispose();
                        Dashboard dashboard = new Dashboard(user);
                    }

                }
            }
        });
    }
}
