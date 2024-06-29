import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner arrayIn = new Scanner(System.in);
        int askArray = arrayIn.nextInt();
        int[] myArray = new int[askArray];
        
        
        for(int k = 0,i = 0; k<myArray.length;k++){
            
            myArray[k] = arrayIn.nextInt();
            
        }
        System.out.println("OUTPUT:");
        for(int s = 0;s<myArray.length;s++){
            System.out.println(myArray[s]);
        }
        
    }
}
