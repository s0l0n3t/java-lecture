public class mine {



    public static void createMinefield(int high, int width){
        String[][] mineMatris = new String[high][width];
        int mineCount = high*width;
        for(int i = 0;i<mineCount;i++){
            int mineCoord = (int)Math.random() * ((high*width) -1);
            // 4
            /*  - - - 03
             *  - - - 10
             *  - - -
             */
            findCoord(width, mineCoord); //Find coord for mines.
        }

    }

    public static int findCoord(int width,int mineCoord){
        int count = 0;
        if(mineCoord > width){
            mineCoord -= width; // 5
            count++;
            return count; //gonna be high for matris
        }
       
        return findCoord(width, mineCoord);
    }

}
