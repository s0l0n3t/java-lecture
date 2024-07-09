import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner appScanner = new Scanner(System.in);
        int stdIn = appScanner.nextInt();
        if(stdIn >= 1 && stdIn <= Math.pow(2,30)){
            if(square(stdIn) == 0){
                System.out.println(stdIn+" is power of 2");
                System.out.println("An instance of class: Solution.Inner.Private has been created");
            }
            else{
                System.out.println(stdIn+" is not a power of 2");
                System.out.println("An instance of class: Solution.Inner.Private has been created");
            }
        }
        

    }
    static int square(int stdIn){        
        
        if(stdIn == 2){
            return stdIn%2;
        }
        if(stdIn == 1){
            return stdIn;
        }
        else if(stdIn%2 != 0){
            return stdIn;
        }
        
        return square(stdIn/2);
    }
}
