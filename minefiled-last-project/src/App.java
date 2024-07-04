import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to mine field !");
        
        Scanner matScanner = new Scanner(System.in);
        int matrisRow = matScanner.nextInt();
        int matrisColumn = matScanner.nextInt();
        int mineCount = (matrisRow*matrisColumn)/4;
        int[][] mineCoordArray = new int[mineCount][2];
        int mineFoundRow = 0;
        int mineFoundColumn = 0;
        String[][] mineFoundStrings = new String[matrisRow][matrisColumn];

        for(int k = 0;k<mineFoundStrings.length;k++){//Creating finding matris
            for(int j = 0; j<mineFoundStrings[0].length;j++){
                mineFoundStrings[k][j] = "-";
            }
            System.out.println();
        }
        int mineFound = 0;
        System.out.println();
        if(matrisRow >= 2 && matrisColumn >= 2){
            mine.createMinefield(matrisRow, matrisColumn,mineCount,mineCoordArray); //Mine field function
            while(mineFound == 0){
            System.out.print("Type Row : ");
            int guessRow = matScanner.nextInt();
            System.out.print("Type Column : ");
            int guessColumn = matScanner.nextInt();System.out.println("==========================");
            
            for(int i = 0;i<mineCoordArray.length;i++){//Searching
                if(mineCoordArray[i][0] == guessRow && mineCoordArray[i][1] == guessColumn){
                    mineFound++;
                    
                }
            }
            if(mineFound > 0 ){
            //Creating finding matris
            mineFoundStrings[guessRow][guessColumn] = "0";
            for(int k = 0;k<mineFoundStrings.length;k++){//Creating finding matris
                for(int j = 0; j<mineFoundStrings[0].length;j++){
                    System.out.print(mineFoundStrings[k][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("Game Over !!");
            break;
            }
            else{
                mineFoundStrings[guessRow][guessColumn] = Integer.toString(mineCount);
            }
            
            for(int k = 0;k<mineFoundStrings.length;k++){//Creating finding matris
                for(int j = 0; j<mineFoundStrings[0].length;j++){
                    System.out.print(mineFoundStrings[k][j]+ " ");
                }
                System.out.println();
            }

            
        }
        
            
        }
        else{
            System.out.println("Row or column numbers are not enough !");
        }
        matScanner.close();
	}

    }



   

