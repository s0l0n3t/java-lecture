import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int bestValue = 0;
        Scanner sc = new Scanner(System.in);
        try {
            while (sc.hasNext()) {
                int varScanner = sc.nextInt();
                if (bestValue <= varScanner) {
                    bestValue = varScanner;
                }
                System.out.println("Best value : "+ bestValue);
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}
    

