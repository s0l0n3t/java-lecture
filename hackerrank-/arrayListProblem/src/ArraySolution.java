import java.util.*;

public class ArraySolution {

    public static void main(String[] args) {
        //solution as array.
        Scanner vScanner = new Scanner(System.in);
        int row = vScanner.nextInt();
        int[][] arrayInteger = new int[row][row];
        for(int x = 0;x<row;x++){
            int column = vScanner.nextInt();
            for(int a = 0;a< column;a++){
                int value = vScanner.nextInt();
                arrayInteger[x][a] = value;
                /*System.out.println("array created "+ row+" first int "+ column+ " array "+x+" value"+ value); */
            }

        }
        int valuePrinter = vScanner.nextInt();
        for(int vPrint = 0;vPrint<valuePrinter;vPrint++){
            int arrayValue = arrayInteger[vScanner.nextInt()-1][vScanner.nextInt()-1];

            if(arrayValue != 0){
                System.out.println(arrayValue);
            }
            else{
                System.out.println("ERROR!");
            }
        }

    }
}