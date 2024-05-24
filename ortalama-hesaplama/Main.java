import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int varOgrenci1 = 0;
        int varOgrenci2 = 0;
        Scanner scanNot = new Scanner(System.in);
        System.out.print("tarih notu 1: ");
        varOgrenci1 = scanNot.nextInt();
        Scanner scanNot1 = new Scanner(System.in);
        System.out.print("tarih notu 2: ");
        varOgrenci2 = scanNot1.nextInt();
        int varOrtalama = (varOgrenci1 + varOgrenci2)/2;
        String gecme = (varOrtalama > 60) ? "Gecti !" : "Kaldı !";
        System.out.println("Not durumu : " + gecme);
        scanNot.close();
        scanNot1.close();

}}
