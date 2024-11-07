package com.swingdev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static int getCenterX(Dimension getScreen,Dimension getSize){
        return (getScreen.width - getSize.width)/2;
    }
    public static int getCenterY(Dimension getScreen,Dimension getSize){
        return (getScreen.height - getSize.height)/2;
    }
    public static void messageLoginSuccess(){
        JOptionPane.showMessageDialog(null,"Success","Success",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void messageLoginFailed(){
        JOptionPane.showMessageDialog(null,"Failed","Failed",JOptionPane.INFORMATION_MESSAGE);
    }
}
