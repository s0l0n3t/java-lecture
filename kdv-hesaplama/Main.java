import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {
        float varTutar = 0;
        Scanner rScanner = new Scanner(System.in);
        System.out.print("Tutar >");
        varTutar = rScanner.nextFloat();
        float KDV = varTutar*0.18f;
        double tutar = varTutar + KDV;
        System.out.println("KDV'li fiyat: " + tutar);
        System.out.println("KDV fiyatı: " + KDV);
        rScanner.close();
    }
}