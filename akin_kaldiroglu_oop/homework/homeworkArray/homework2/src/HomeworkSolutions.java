import java.util.Arrays;

public class HomeworkSolutions {
    private int[] testArray = {60,55,45,12,3,4,1,3,4};

    public HomeworkSolutions(){
        homework1ArrayCopy(testArray);
    }

    public void homework1ArrayCopy(int[] arrayCopy){
        int count = 0;
        int[] arrayTest = new int[arrayCopy.length];
        //int[] arrayNewTarget = Arrays.copyOf(arrayCopy, arrayCopy.length);
            for (int i = 0; i<arrayCopy.length;i++){
                for (int k = 0;k<arrayCopy.length;k++){
                if (arrayCopy[i] == arrayCopy[k] && i != k ) {
                    arrayCopy[k] = 0;
                }
                else{
                    arrayTest[i] = arrayCopy[i];   
                }
            }
        }
        System.out.println();
        for(int k = 0;k< arrayTest.length;k++){
            if (arrayTest[k] != 0) {
                count++;
            }
        }
        int[] testArray2 = new int[count];
        count = 0;
        for(int k = 0;k< arrayTest.length;k++){
            if (arrayTest[k] != 0) {
                testArray2[count] = arrayTest[k];
                System.out.println(testArray2[count]);
            }
        }
    }
}

class SieveOfEratosthenes{
    //Sieve Of Erastosthenes algorithm
    //Time Complexity: O(N*log(log(N)))
    private boolean[] prime;
    public SieveOfEratosthenes(int index){
        System.out.println();
        createPrimeArray(index);
        for(int i = 0; i< findPrimeNumbers(prime,index).length;i++){
            System.out.print(findPrimeNumbers(prime,index)[i]+" ");
        }System.out.println();

    }
    private void createPrimeArray(int index){
       prime = new boolean[index+1];
       for(int i = 0;i<= index;i++){
           prime[i] = true;
           //Arrays.fill(prime,true); We can use that function.
       }
    }
    private int[] findPrimeNumbers(boolean[] primeArray,int index){
        int count = 0;
        for(int i = 2;i*i<= index;i++){
            if(primeArray[i]){
                for(int j = i*i;j<= index;j += i){
                    primeArray[j] = false;
                    count++;
                }
            }
        }
        int[] newPrimeArray = new int[count];
        count = 0;
        for(int k = 2;k<primeArray.length;k++){
            if(primeArray[k]){
                newPrimeArray[count] = k;
                count++;
            }
        }
        return newPrimeArray;
    }
}
