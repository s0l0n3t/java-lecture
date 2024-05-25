import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        long varScan4;
        Scanner varScanner = new Scanner(System.in);
        int varDigit = varScanner.nextInt();
        for(int i=0;i<varDigit;i++){
            
            

            try {
                varScan4 = varScanner.nextLong();
                System.out.println(varScan4 + " can be fitted in: ");
                if(varScan4 < 128 && varScan4 >= -128)System.out.println("* byte");
    
                
                if(varScan4 <= 32767 && varScan4 >= -32768)System.out.println("* short"); 
                
                if(varScan4 <= 2147483647 && varScan4 >= -2147483648 )System.out.println("* int"); 
                
                  
                
                System.out.println("* long");
            } catch (Exception e) {
                
                System.out.println(varScanner.next()+" can't be fitted anywhere.");
                
                
            }
            
        }
        
        
        
    }
}
