import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner varScanner = new Scanner(System.in);
        
        
        int varBreath = varScanner.nextInt();
        int varHeigh = varScanner.nextInt();

        try {
           
        if(varBreath > 0 && varHeigh > 0){
            if(varBreath <= 100 && varHeigh <= 100){
                System.out.println(varBreath*varHeigh);

            }
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
         catch (Exception e) {
            System.out.println(e);
        }
        
}
}