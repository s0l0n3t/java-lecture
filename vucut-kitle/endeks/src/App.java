
import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        float varBoy = 0;
        float varKilo = 0;
        
        
        Scanner endScanner = new Scanner(System.in);
        Scanner end1Scanner = new Scanner(System.in);
        System.out.print("Boy : ");
        varBoy = endScanner.nextFloat();
        System.out.print("Kilo : ");
        varKilo = end1Scanner.nextFloat();
        double varEndeks = varKilo/(varBoy*varBoy);
        System.out.println("Boy-Kilo-endeks : "+varEndeks );
        endScanner.close();
        end1Scanner.close();
    }
}
