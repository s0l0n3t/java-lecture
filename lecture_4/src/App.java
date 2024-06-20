import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        algorithm();
        System.out.println(carpma(10, 20));*/

        print();// Overloading sample
        print(12);

    }/*
    static int carpma(int numberA,int numberB){
        return numberA*numberB;
    }
    static void algorithm(){
        for(int x = 0 ; x<10;x++){
            System.out.println("Iam an function.");
        }
    } */
    static void print(){
        System.out.println("Merhaba !");
    }
    static void print(int a){
        System.out.println("Parametre: "+a);
    }
    
}
