import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        // Recursive Metotlar ile Üslü Sayı Hesaplama:
        // Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
        int first=0,sec=0;
        System.out.print(">");
        Scanner powScanner = new Scanner(System.in);

        first = powScanner.nextInt();
        sec = powScanner.nextInt();
        System.out.println(pow(first, sec));



    }

    static int pow(int x, int y){
        int total = 1;
        for (int i=0;i< y; i++){
            total = x*total;
        }
        return total;
    }
}
