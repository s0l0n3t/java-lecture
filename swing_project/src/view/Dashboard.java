package view;

import entity.User;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{
    private JPanel container;
    private JLabel label_welcome;
    private final User user;


    public Dashboard(User user){//identified.
        this.user = user;
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
    }
}
