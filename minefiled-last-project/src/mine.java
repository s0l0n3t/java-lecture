public class mine {



    public static void createMinefield(int high, int width){
        String[][] mineMatris = new String[high][width];
        int mineCount = (high*width)/4;
        int mineHeigh= 0;
        int mineWidth= 0;

        for(int j = 0;j< mineMatris.length;j++){ //Creating mine field
            for(int k = 0; k< mineMatris[j].length;k++){
                mineMatris[j][k] = "-";
            }
        }
       
        for(int i = 0;i<mineCount;i++){
           
            int mineCoord = (int)Math.random()*10;
            System.out.println(mineCoord);// Warning. I cant get random number.
            // 4
            /*  - - - 03
             *  - - - 10
             *  - - -
             */
            mineWidth = findCoordWidth(width, mineCoord); //Find width
            while(mineCoord > width){
                mineCoord -= width; // 5
                
                mineHeigh++; //Heigh
            }

            mineMatris[mineHeigh][mineWidth] = "*";

            
        }
        
        for(int j = 0;j< mineMatris.length;j++){ //Creating mine field
            for(int k = 0; k< mineMatris[j].length;k++){
                System.out.print(mineMatris[j][k] + " ");
            }
            System.out.println();
        }



    }

    
    public static int findCoordWidth(int width,int mineCoord){
        
        if(mineCoord > width){
            mineCoord -= width; 
            return findCoordWidth(width, mineCoord);
        }
        return mineCoord; // width
    }

}
