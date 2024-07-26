package view;

import javax.swing.*;
import java.awt.*;

public class mainForm extends JFrame{
    private JPanel container;
    private JPanel pnl_top;
    private JTextField text_pass;
    private JTextField text_mail;
    private JPanel pnl_bottom;
    private JButton btn_submit;


    public mainForm(){
        this.add(container);
        this.setTitle("Customer Form App");
        this.setSize(400,400);
        this.setVisible(true);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - this.getSize().width)/2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - this.getSize().height)/2;
        this.setLocation(x,y);
    }
}
