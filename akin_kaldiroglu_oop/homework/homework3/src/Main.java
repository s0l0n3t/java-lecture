import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner varSc = new Scanner(System.in);
       RootOfFunction rootOfFunction = new RootOfFunction();
       rootOfFunction.calculateRoot(varSc.nextDouble(), varSc.nextDouble(), varSc.nextDouble());

        while(true){
            System.out.println("FizzBuzz Game");
            System.out.print("> ");
            FizzBuzz fizzBuzzClass = new FizzBuzz(varSc.nextInt());
        }
        
        ChangeNumbers changeNumbersRef = new ChangeNumbers(255);
        FindPrime findPrimeRef = new FindPrime(155);
        CopyPrice copyPriceRef = new CopyPrice(19);
    }
}

class FizzBuzz{
    private int varInt;
    public FizzBuzz(int varInt){
        if(fizzbuzz(varInt) == STATUS.DEFAULT){
            System.out.println(varInt);
        }
        else {
            System.out.println(fizzbuzz(varInt));
        }
    }

    public enum STATUS{
        FIZZ,
        BUZZ,
        FIZZBUZZ,
        DEFAULT
    }
    private STATUS fizzbuzz(int varInt){
        if(varInt % 15 == 0){
            return STATUS.FIZZBUZZ;
        }
        else if(varInt % 3 == 0){
            return STATUS.FIZZ;
        }
        else if(varInt % 5 == 0){
            return STATUS.BUZZ;
        }
        else {
            return STATUS.DEFAULT;
        }
    }

}
class ChangeNumbers{

    public ChangeNumbers(int varInt){
        System.out.println(varInt%10 + ""+findFirst(varInt));
    }

    private int findFirst(int varInt){
        if (varInt < 10){
            return varInt;
        }
        return findFirst(varInt/10);
    }
}
class FindPrime{
    private ArrayList<Integer> primeList = new ArrayList<>();


    public FindPrime(int varInt){
        addPrimeNumbers();

        for(int x = 0;x<decreaseNumber(primeList.size(), varInt);x++){
            if(primeList.get(x) < varInt){
                System.out.println(primeList.get(x));
            }
        }
    }
    private void addPrimeNumbers(){
        primeList.add(2);
        primeList.add(3);
        primeList.add(5);
        primeList.add(7);
        primeList.add(11);
        primeList.add(13);
        for(int i = 2; i< 10000;i++){

            if(i %13 != 0 && i % 11 != 0 && i % 7 != 0 && i % 5 != 0 && i % 3 != 0 && i % 2 != 0){
                primeList.add(i);
            }
        }
    }
    private int decreaseNumber(int arraySize, int varInt){
        if(arraySize - varInt < 20){

            return arraySize;
        }
        return decreaseNumber(arraySize/2,varInt);
    }
}
class CopyPrice{
    private double price;
    public CopyPrice(int varInt){
        System.out.println(copyCalculate(varInt));
    }
    private double copyCalculate(int varInt){
        if(varInt >= 25){
            price+= 1;
            return copyCalculate(varInt - 25);
        }
        else if(varInt >= 12){
            price += 0.50;
            return copyCalculate(varInt - 12);
        }
        else {
            return price+= varInt*0.05;
        }

    }
}