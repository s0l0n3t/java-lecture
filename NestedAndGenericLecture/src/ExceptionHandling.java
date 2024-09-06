import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static int[] arrayInt = new int[2];

    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            int i = 10;
            System.out.println(10/scanner.nextInt());
            arrayInt[10] = 11;
        }
        catch (ArithmeticException e){
            e.printStackTrace();//default error output.
            System.out.println(e.getMessage());//error message output.

        }
        catch (InputMismatchException mismatchException){
            System.out.println(mismatchException.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Sıfırla bölünmek istendi !");
            }
        }
        finally {
            System.out.println("This section definitely will work !");
        }
    }
}
