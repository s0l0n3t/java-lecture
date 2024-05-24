import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        int r =0;
        double PI = 3.14;
        Scanner rScanner = new Scanner(System.in);
        System.out.print("r = ");
        r = rScanner.nextInt();
        System.out.println("Alan = " + r*PI*r);
        System.out.println("Cevre = " + 2*PI*r);


    }
}
