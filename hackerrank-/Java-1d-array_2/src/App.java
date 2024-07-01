import java.util.Scanner;
import java.text.BreakIterator;
import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;
import javax.management.Query;
import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner arrayScanner = new Scanner(System.in);
            int qeuries = arrayScanner.nextInt();
            while(qeuries-- > 0){
                int numberArray = arrayScanner.nextInt();
                int leap = arrayScanner.nextInt();

                int[] arrayGame = new int[numberArray];

                for(int i = 0;i<numberArray;i++){
                    arrayGame[i] = arrayScanner.nextInt();
                }
                if(isPlay(leap, arrayGame)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            arrayScanner.close();
        }
        static boolean isPlay(int l,int[] gameInput){
           
            return isOver( 0, l, gameInput);
        }


        static boolean isOver(int i, int leap, int[] gameInput){
            if(i < 0 || gameInput[i] == 1){
                return false;
            }
            else if(i >= gameInput.length){
                return true;
            }
            gameInput[i] = 1;
            return isOver(i+leap, leap, gameInput) || isOver(i+1, leap, gameInput) || isOver(i-1, leap, gameInput);
        }
    }






    
