import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int varOgrenci1 = 0;
        int varOgrenci2 = 0;
        Scanner scanNot = new Scanner(System.in);
        System.out.println("tarih notu 1: ");
        varOgrenci1 = scanNot.nextInt();
        Scanner scanNot1 = new Scanner(System.in);
        System.out.println("tarih notu 2: ");
        varOgrenci2 = scanNot1.nextInt();
        System.out.println("Matematik ortalaması > ");
        System.out.print((varOgrenci1 + varOgrenci2)/2);
        boolean gecme = ((varOgrenci1 + varOgrenci2)/2) ? "Gecti !" : "Kaldı !";

}}
