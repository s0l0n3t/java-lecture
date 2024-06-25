import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner tScanner = new Scanner(System.in);
        
        /* 
        algorithm();
        System.out.println(carpma(10, 20));*/
/*
        print();// Overloading sample
        print(12); */

        /*FACTORIAL
        int total=1;
        total *= r(3);
        System.out.println(total);
         */

         //Polidrom Number finder calling
         /*
        int numberTest=0;
        numberTest = tScanner.nextInt();
        System.out.println(isPolindrom(numberTest));
        tScanner.close(); */

        // Fibonacci as recursive
        /*
        int fiboNumber =0;
        fiboNumber = tScanner.nextInt();
        System.out.println(fiboFunction(fiboNumber)); */
        
        // Prime number checker
        /*
        int stdNumber = 0;
        stdNumber = tScanner.nextInt();
        System.out.println(isPrimeNumber(stdNumber));
         */

         // Recursive pattern algoritm
         /*
        int selectNumber = 0;
        
        int count = 0;
        selectNumber = tScanner.nextInt();
        count = pattern(selectNumber);
        
        System.out.println(sum(count, selectNumber));
        
        
        tScanner.close();
          */


          
    }
    /*
    static int carpma(int numberA,int numberB){
        return numberA*numberB;
    }
    static void algorithm(){
        for(int x = 0 ; x<10;x++){
            System.out.println("Iam an function.");
        }
    } */ // OVERLOAD SAMPLE
     /*
    static void print(){
        System.out.println("Merhaba !");
    }
    static void print(int a){
        System.out.println("Parametre: "+a);
    }
     */
    /*  FACTORIAL
    static int r(int n){
        System.out.println(n);
        if (n == 1){
            return 1;
        }
        //f(n) = f(m-1) + n problemi cozumu
        return r(n-1)*n;
    } */ // Palidrom number finder function
     /*
   static Boolean isPolindrom(int numberA){
    int reverseNumber=0,lastNumber=0,numberB = numberA;
    while(numberA != 0 ){
        //247
        lastNumber = numberA %10;
        reverseNumber = (reverseNumber * 10) + lastNumber;
        numberA /= 10;
    }
    if (numberB == reverseNumber){
        return true;
    }
    else{
        System.out.println(reverseNumber);
        return false;
    } 
    
   }*/
    // Fibonacci as recursive
    /*
   static int fiboFunction(int x){
    
    if (x == 1 || x == 2){
        return 1;

    }
    
    return fiboFunction(x-1) + fiboFunction(x-2);
   }
*/
    // Prime number checker
    /*
    static boolean isPrimeNumber(int stdInput){
        if(stdInput %2 == 0 || stdInput%3 == 0 || stdInput %5 == 0 || stdInput % 7 == 0){
            return false; 
        }
        else{
            return true;
        }
    } */

    // recursive pattern algoritm
    /* 
   static int pattern(int x){
    if(x <= 0){
        return x;
        }
        
    
    System.out.print(x + " ");
    return pattern(x-5);
   }
   static int sum(int x, int y){
    if (x != y){
        System.out.print(x + " ");
        return sum(x+5, y);
    }
    return x;
   }*/

  
}
