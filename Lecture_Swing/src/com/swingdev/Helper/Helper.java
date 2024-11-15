package com.swingdev.Helper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Helper{
    public static final char[] lowerCaseAlphabet = {'a','b','c','ç','d','e','f','g','ğ','h','ı','i','j','k','l','m','n','o','ö','p','q','r','s','ş','t','u','ü','v','w','x','y','z'};
    public static final char[] upperCaseAlphabet = {'A','B','C','Ç','D','E','F','G','Ğ','H','I','İ','J','K','L','M','N','O','Ö','P','Q','R','S','Ş','T','U','Ü','V','W','X','Y','Z'};
    public static final Object[] personColumnList= {"ID","Name","Surname","Permit","Type","Experience"};
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
    public static ArrayList<String> textSplit(String inputText){
        String word = "";
        ArrayList<String> wordArrayList = new ArrayList<>();
        char[] textCharArray = inputText.toCharArray();
        for(int i = 0;i<textCharArray.length;i++){
            if(textCharArray[i] == 32){// space char code = 32
                if(!word.isEmpty()){
                    wordArrayList.add(word);
                }
                word = "";

            }
            else {
                word+= textCharArray[i];
            }
        }
        if(!word.isEmpty()){
            wordArrayList.add(word);
        }
        return wordArrayList;
    }
}
