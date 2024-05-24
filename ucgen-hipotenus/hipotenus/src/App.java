import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int x=0;
    int y=0;
    int z=0;
    
    Scanner vScanner = new Scanner(System.in);
    Scanner v2Scanner = new Scanner(System.in);
    
    System.out.print("x> ");
    x = vScanner.nextInt();
    System.out.print("y> ");
    y = v2Scanner.nextInt();
    z  = (x*x) + (y*y);
    
    System.out.println("   |\\");
    System.out.println("   | \\");
    System.out.println(  x+ " |  \\  "+Math.sqrt(z));
    System.out.println("   |   \\");
    System.out.println("   |    \\");
    System.out.println("   |     \\");
    System.out.println("   --------");
    System.out.println("      "+y+"   ");
    
        
    }
}
