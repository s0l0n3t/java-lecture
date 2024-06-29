import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        int[] arrayTest = new int[10];
        //Boyut belirtilmesi zorundadır.
        int arrayTest1[] = new int[20];
        //2 şekilde de kullanılabilmektedir.

        arrayTest[0] = 1;
        arrayTest[1] = 2;
        arrayTest1[0] = 10;
        arrayTest1[1] = 20;

        System.out.println(arrayTest[1]); // Output: 2
        System.out.println(arrayTest[2]);
        System.out.println(arrayTest.length);

        for(int i =0;i<arrayTest.length;i++){
            arrayTest[i] = i;
            System.out.println(arrayTest[i]);

            
        }
        int[] arrayTest2 = { 10 , 20 ,30 , 40}; //Dizi boyutu 4 elemanlıdır. Son eleman 3'tür.
        arrayPrinter(arrayTest2);
        arrayReverse(arrayTest2);
        */

        
        int[] list1 = new int[5];
        list1[0] = 12;

        //Çok boyutlu diziler
        int[][] arrayMulti = new int[6][6];
        arrayMulti[0][0] = 0;
        arrayMulti[2][3] = 839;

        int[][] arrayMulti1 = {//Öntanımlı dizi.
            {0,1,2,3,4,5,6},
            {1,2,3,4,5,6,7},
            {10,11,12,13,14},
        };
       // System.out.println(arrayMulti1[1][2]);

        for(int i = 0; i< arrayMulti1.length;i++){
            //arrayMulti1[i][0]
            System.out.println();
            for(int j=0;j< arrayMulti1[i].length;j++){
                System.out.print(arrayMulti1[i][j]+ " ");
            }
        }
        //Foreach kullanımı
        for(int i: list1){
            System.out.println(i);
        }
        String[] arrayString = {"merhaba","ben furkan"};

        for(String s : arrayString){
            System.out.println(s);
        }

        
        /*
        //Homework for patikadev #1 #Arrays
        int[] arrayOrt = {3,5,1,4,7};
        int summ = 0;
        for(int x = 0; x< arrayOrt.length; x++){
            summ += arrayOrt[x];
        }
        System.out.println("Ortalama: "+ summ/arrayOrt.length);
         */
        /*
        //Homework for patikadev #2 #Arrays
        int[] arrayInteger = {2,4,7,5,3,4,5,1,2};
        System.out.print("Min: ");
        System.out.println(arrayMax(arrayInteger));

        System.out.print("Max: ");
        System.out.println(arrayMin(arrayInteger));
         */





        /*
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];
        System.out.print(sum);
        //OUTPUT:
       // 1 1 1
         // 2 2
           // 3 */

        /*
        //Homework patikadev #3 #arrays
        int[][] arrayMultiA = {
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
        };

        for(int i = 0;i< arrayMultiA.length;i++){
            for(int j = 0;j < arrayMultiA[i].length; j++){
                
                
                if(i == 0 || i == 2 || j == 5){
                    arrayMultiA[i][j] = 1;
                }

            }
            
        }

        System.out.println();
        for(int i = 0;i< arrayMultiA.length;i++){
            for(int j = 0;j < arrayMultiA[i].length; j++){
                
                System.out.print(arrayMultiA[i][j]+ " ");
            }
            System.out.println();
            
        } */







    }
    /*
    //Homework for patikadev #2 #Arrays
    static int arrayMax(int[] array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(max < array[i]){
                max = array[i];
                
            }
        }

        
        return max;
    }
    static int arrayMin(int[] array){
        int min = 50000;
        for(int i = 0;i<array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    } */

    /*
    static void arrayPrinter(int[] arrayPrinter){
        for(int i = 0; i<arrayPrinter.length;i++){
            System.out.println(arrayPrinter[i]);
        }
    }
    static int[] arrayReverse(int[] selecterArray){
        int[] arrayReversed = new int[selecterArray.length];

        for(int i = 0,j = selecterArray.length-1;i< selecterArray.length;i++,j--){

            arrayReversed[i] = selecterArray[j];
            System.out.println(arrayReversed[i]);
        }
        
        
        return arrayReversed;
    } */
}
