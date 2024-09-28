import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            try {
                new MatrixProcessClass();
            }catch (Exception exception){
                System.out.println("ERROR ! ! !");
                System.out.println(exception.toString()+"\n");
            }
        }
    }

}