public class mine {
    int row = 0;
    int column = 0;
    

    public static void createMinefield(int row, int column, int mineCount,int[][] mineCoordArray){
        mine accMine = new mine();
        String[][] mineMatris = new String[row][column];
        accMine.row = row;
        accMine.column = column;
        int mineRow= 0;
        int mineColumn= 0;
        for(int j = 0;j< mineMatris.length;j++){ //Creating mine field
            for(int k = 0; k< mineMatris[j].length;k++){
                mineMatris[j][k] = "-";
            }
        }
       
        for(int i = 0;i<mineCount;i++){
           
            int mineCoord = (int)(Math.random()*((column*row)-1));
            
            // 4
            /*  - - - 03
             *  - - - 10
             *  - - -
             */
            mineColumn = findCoordColumn(column, mineCoord); //Find width
            mineRow = mineCoord / row;
            mineMatris[mineRow][mineColumn] = "*";
            mineCoordArray[i][0] = mineRow;
            mineCoordArray[i][1] = mineColumn;
        }
        
        for(int j = 0;j< mineMatris.length;j++){ //Print mine field
            for(int k = 0; k< mineMatris[j].length;k++){
                System.out.print(mineMatris[j][k] + " ");
            }
            System.out.println();
        }
    }

    
    public static int findCoordColumn(int column,int mineCoord){
        if(mineCoord >= column){
            mineCoord -= column; 
            return findCoordColumn(column, mineCoord);
        }
        return mineCoord; // width
    }
}
