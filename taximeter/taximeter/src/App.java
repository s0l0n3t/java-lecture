import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        double varKm =0;
        int varintMin = 20;
        double varintPrice = 0;
        Scanner kmScanner = new Scanner(System.in);
        System.out.print("KM > ");
        varKm = kmScanner.nextDouble();
        varintPrice = varKm*2.20;
        varintPrice = ( varintPrice <= 20) ? varintMin : varintPrice;
        System.out.println(varintPrice);
        kmScanner.close();
    }
}
