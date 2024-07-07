import java.security.cert.TrustAnchor;
import java.util.Arrays;
import java.util.Scanner;
;

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

        //MATH CLASS

        System.out.println(Math.abs(-100)); //Mutlak deger.
        System.out.println(Math.cbrt(27)); // küp kök
        System.out.println(Math.ceil(21.12)); //En yakın tam sayıya yuvarlama.
        System.out.println(Math.floor(1.21)); //En yakın tam sayı değeri fakat alt tam sayılar.
        System.out.println(Math.pow(2, 3)); //2^3 üssel ifade çıktısı verir.
        System.out.println(Math.sqrt(16)); //Karekök.

        //String CLASS

        String varString = "Furkan";
        System.out.println(varString.charAt(2)); //Stringdeki index numarasına göre karakter elde etmek.
        char b = 'b';
        System.out.println(varString.codePointAt(2)); // R karakterinin karakter kodu.
        System.out.println(varString.concat(" Selam")); //String sonuna ekleme yapmak.
        System.out.println(varString.contains("r"));//Belirtilen karakter string içerisinde kapsıyor mu? Çıktı: TRUE || FALSE
        System.out.println(varString.isEmpty()); //Değişken dolu veya boş olduğunun çıktısı elde edilir.

        int a = 4; 

        System.out.print((a >> 1)+(a << 2) );


        /*
        // Find the numbers game
        Scanner lastScanner = new Scanner(System.in);
        boolean isTrue = false;
        while(isTrue == false){
        int randomNumber = (int)(Math.random()*10);
        
        int lastNumber = lastScanner.nextInt();

        if(randomNumber == lastNumber){
            isTrue = true;
            System.out.println("Tebrikler !");}
        else{
            System.out.println("Sayı: "+randomNumber);
        }
        }

         */



        /*
        // Polindromik kelime bulma: 287
        int count = 0,base = 0;
        System.out.println();
        Scanner vScanner = new Scanner(System.in);
        String vaString = vScanner.nextLine();
        
        if(isPolindrome(vaString))
            System.out.println("Polindromik");
        else
            System.out.println("Polindromik değil !");*/

            
 
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

        /*
        //Homework patikadev #4 #Arrays
        int[] arrayRepeat = {1,2,2,4,5,6,1,1,1,1,1,2,3,4,5,6,7,8,8};
        int[] repetitive = new int[arrayRepeat.length/2];
        int start = 0;
        for(int i = 0; i< arrayRepeat.length;i++){
            for(int j = 0;j<arrayRepeat.length;j++){
                if((i != j) && arrayRepeat[i] == arrayRepeat[j]){
                    if(!isFind(repetitive, arrayRepeat[i])){
                        repetitive[start++] = arrayRepeat[i];
                    }
                    break;
                }
            }
            
            
        }
        for(int k = 0 ; k< repetitive.length;k++){
            System.out.print("REPEAT NUMBERS: ");
            System.out.println(repetitive[k]);
        } */

        
        /*
        //Homework patikadev #5 #Arrays
        Scanner arrayScanner = new Scanner(System.in);
        int integerArray=0;
        System.out.print("Dizinin Boyutu: ");
        integerArray = arrayScanner.nextInt();
        int objectArray=0;

        int[] arrayNew = new int[integerArray];
        for(int i = 0; i< integerArray; i++){
            System.out.println("Dizi elemanlarını giriniz: ");
            arrayNew[i] = arrayScanner.nextInt();

        }
        System.out.println("Sıralama: ");
        for(int j =0;j< arraySort(arrayNew).length;j++){
            System.out.println(arraySort(arrayNew)[j]);
        }
         */


         /*
        //Hackerrank Challange for silver 
        int first=0;
        double sec;
        
        Scanner fiScanner = new Scanner(System.in);
        
        first = fiScanner.nextInt();
        sec = fiScanner.nextDouble();
        String thirdS = fiScanner.nextLine();
        String thirdS1 = fiScanner.nextLine();

        System.out.println("String: "+thirdS1);
        System.out.println("Double: "+sec);
        System.out.println("Int: "+first); */
    



        
        /*
        //Homework for patikadev #6 #Arrays
        int[] arrayInteger = {10,20,20,10,10,20,5,20};
        int index = 0;

        System.out.println("Tekrar sayıları: ");
        for(int i = 0; i< arrayInteger.length; i++){
            for(int k = 0; k<arrayInteger.length;k++){
                if(arrayInteger[i] == arrayInteger[k]){
                    index++;
                }
                
            }
            System.out.println(arrayInteger[i] + " Sayısı: "+index+ " Kez");
            index = 0;
        }
 */










        
    }
    /*
    //Polindromik sayı bulma
    static boolean isPolindrome(String vaString){
        for(int i = 0,j = vaString.length()-1;i < j;i++,j--){
            if(vaString.charAt(i) != vaString.charAt(j)){
                return false;
            }
        }

        return true;
    } */

    /*
    //Homework patikadev #5 #Arrays
    static int[] arraySort(int[] array){
        int[] best = new int[array.length];
        int start = 0;
        for(int k = 0;k<array.length;k++){
            for(int j =0;j<array.length;j++){
                if(array[k] >= array[j]){
                    best[start] = array[k];
                    start++;
                    break;
                }
            }
        }
        
        return best;
    } */

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
    //Homework patikadev #4 #Arrays
    static boolean isFind(int[] arr, int value){
        for(int i = 0;i<arr.length;i++){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }  */

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
