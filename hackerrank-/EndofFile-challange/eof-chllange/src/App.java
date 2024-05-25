import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner varStScanner = new Scanner(System.in);
            int a=0;
         while (true) {
            String vString = varStScanner.nextLine();
            System.out.print(++a);
            System.out.println(" "+vString);
        }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
