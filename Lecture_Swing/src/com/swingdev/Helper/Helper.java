package com.swingdev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper{

    public static int getCenterX(Dimension getScreen,Dimension getSize){
        return (getScreen.width - getSize.width)/2;
    }
    public static int getCenterY(Dimension getScreen,Dimension getSize){
        return (getScreen.height - getSize.height)/2;
    }
    public static void messageSuccess(String message){
        JOptionPane.showMessageDialog(null,message,"Success",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void messageFailed(String message){
        JOptionPane.showMessageDialog(null,message,"Failed",JOptionPane.INFORMATION_MESSAGE);
    }
}
