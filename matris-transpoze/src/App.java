import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class App {
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner tranScanner = new Scanner(System.in);
        int high = tranScanner.nextInt();
        int width = tranScanner.nextInt();
        int[][] matris = new int[high][width];
        for(int k = 0;k< high;k++)
            for(int j=0; j< width;j++){
                matris[k][j] = tranScanner.nextInt();
             
            }
        // Transpoze
        for(int k = 0;k< width;k++){
            for(int j=0; j< high;j++){
                
                System.out.print(matris[j][k] + " ");
                
            }
            System.out.println();
        }




    }


    

}



    

