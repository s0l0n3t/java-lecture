import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number=0;
        Scanner hScanner = new Scanner(System.in);
        System.out.print("");
        number = hScanner.nextInt();
        hScanner.close();
        if(number%2 == 1){
            System.out.println("Weird");
        }
        else{
            if(number >= 2 && number <= 5){
                System.out.println("Not Weird");
            }
            else if(number >= 6 && number <= 20){
                System.out.println("Weird");
            }
            else if(number > 20 && number <= 100){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("error");
            }
        }

    }
}
