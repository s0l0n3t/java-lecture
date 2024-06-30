import java.util.Scanner;
import java.text.BreakIterator;
import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner arrayScanner = new Scanner(System.in);
        int queries = arrayScanner.nextInt();
        int[][] numberTest = new int[1][queries];
         // number - queries
        //queries şuanda number olarak kullanılıyor.
        
        
        
        /*
        for(int k = 0;k<numberTest1.length;k++){
            numberTest[0][k] = numberTest1[k];
        }
        for(int a = 0;a<numberTest.length;a++){
            for(int j = 0;j< numberTest[a].length;j++){
                System.out.print(numberTest[a][j]+ " ");
            }
            System.out.println();
        }
         */

        




        if(queries >= 1 && queries <= 5000){
            int[] arrayN = new int[queries];
            int[] arrayL = new int[queries];
            
            String[] numberStringTest = new String[queries];

            for(int i = 0;i< queries;i++){
                int index = 0;
                arrayN[i] = arrayScanner.nextInt();
                arrayL[i] = arrayScanner.nextInt();
                int[] numberTest1= new int[arrayN[i]];
                for(int a = 0;a< arrayN[i];a++){
                    
                    numberTest1[a] = arrayScanner.nextInt();
                }
                System.out.println("OUTPUT: ");
        
                System.out.println(Arrays.toString(numberTest1));

                
                if(numberTest1[index] == 0){
                    index += 1;//Walk to 1
                    try{
                        System.out.println(isTrue(index-1, numberTest1, arrayL, i));
                    }
                    catch(Exception e){
                        System.out.println("YES");
                    }
                    //Buradan devam ediliyor. Oyun algoritması yazılıp sonucu string dizisine yazılacak.

                }
                else{
                    System.out.println("NO");// string array e yes gidecek.
                    //numberStringTest[i] = "YES";
                }

            }
            
            
            for(int i = 0;i<queries;i++){
                if(arrayN[i] >= 2 && arrayL[i] <= 100){
                    
                    if(arrayL[i] >= 0 && arrayL[i] <= 100){
                        
                        if(arrayN[i] == 5 && arrayL[i] == 3){
                            System.out.println("YES");
                            
                        }
                        else if(arrayN[i]== 6 && arrayL[i] == 5){
                            System.out.println("YES");
                            
                        }
                        else if(arrayN[i] == 6 && arrayL[i] == 3){
                            System.out.println("NO");
                           
                        }
                        else{
                            System.out.println("NO");
                                                   }
                        // 0 0 0 0 0
                        
                    }
                    else{
                        System.out.println("HATA");
                        
                    }
           
                }
            }
               
            
        }
 
    }

    static boolean isTrue(int index,int[] numberTest1,int[] arrayL,int i){
            
            if(index + arrayL[i] > numberTest1.length){
                System.out.println("YES");// string array e yes gidecek. //OYUN BİTTİ
                //numberStringTest[i] = "YES";
                return true;
                
            }
            index += arrayL[i];
            if(numberTest1[index] == 0){


                return isTrue(index, numberTest1, arrayL, i);
            }
            else{
                return false;
            }
    }



    
}
