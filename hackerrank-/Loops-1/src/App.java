import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner hackScanner = new Scanner(System.in);

        int inputNumber = 0;
        inputNumber = hackScanner.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(inputNumber +" x "+i+" = "+(inputNumber*i));
        }
        hackScanner.close();


    }
}
