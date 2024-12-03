package com.coderbyteChallange;

import java.lang.reflect.Array;
import java.util.*;

public class secondQuestionClass {
        public static boolean getAlphabet(String str){
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            char[] charAlphabet = alphabet.toCharArray();
            ArrayList<Character> confirmAlphabet = covertArrayList(charAlphabet);

            char[] charInputArray = str.toCharArray();
            for(int i = 0;i<confirmAlphabet.size();i++){
                for(int j = 0;j<charInputArray.length;j++){
                    if(confirmAlphabet.get(i) == charInputArray[j]){
                        confirmAlphabet.remove(i);
                    }
                }
            }
            if(confirmAlphabet.isEmpty()){
                return true;
            }
            return false;
        }
        public static ArrayList<Character> covertArrayList(char[] charArray){
            ArrayList<Character> arrayList = new ArrayList<>();

            for(int i = 0;i<charArray.length;i++){
                arrayList.add(charArray[i]);
            }
            return arrayList;
        }
    }
class mainClass{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(secondQuestionClass.getAlphabet(s.nextLine()));
    }
}

