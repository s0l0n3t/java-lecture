import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        int selectNumber;
        int first=0,sec=0;
        Scanner selectScanner = new Scanner(System.in);
        String selecString = """
                    1- Toplama\n
                    2- Cikartma\n
                    3- Bolme\n
                    4- Üslü sayi Hesaplama\n
                    5- Çarpma\n
                    6- Mod alma\n
                    7- Dikdörtgen alan ve çevre hesabi\n
                    0- Cikis
                    """;

        do{
            System.out.println(selecString);
            selectNumber = selectScanner.nextInt();
            
            switch(selectNumber){
                case 1:
                    System.out.println("Numbers> ");
                    first = selectScanner.nextInt();
                    sec = selectScanner.nextInt();
                    System.out.println(sum(first, sec));
                break;
                case 2:
                    System.out.println("Numbers> ");
                    first = selectScanner.nextInt();
                    sec = selectScanner.nextInt();
                    System.out.println(div(first, sec));
                break;
                case 3:
                    System.out.println("Numbers> ");
                    first = selectScanner.nextInt();
                    sec = selectScanner.nextInt();
                    System.out.println(div(first, sec));
                break;
                case 4:
                    System.out.println("Numbers> ");
                    first = selectScanner.nextInt();
                    sec = selectScanner.nextInt();
                    System.out.println(exp(first, sec));
                break;
                case 5:
                    System.out.println("Numbers> ");
                    first = selectScanner.nextInt();
                    sec = selectScanner.nextInt();
                    System.out.println(multi(first, sec));
                break;
                case 6:
                    System.out.println("Numbers> ");
                    first = selectScanner.nextInt();
                    sec = selectScanner.nextInt();
                    System.out.println(mod(first, sec));
                break;
                case 7:
                    
                    System.out.print("(Area = 1 or Perimeter = 2) >");
                    selectNumber = selectScanner.nextInt();
                    System.out.println("Numbers> ");
                    first = selectScanner.nextInt();
                    sec = selectScanner.nextInt();
                    System.out.println(areaOrPerimeter(first, sec, selectNumber));

                break;
            }
            
        }
        while(selectNumber != 0);
            
        


    }

    static int sum(int x, int y){
        return x + y;
    }
    static int sub(int x, int y){
        return x - y;
    }
    static int div(int x, int y){
        return x / y;
    }
    static int exp(int x, int y){
        double total = Math.pow(x, y); 
        return (int)total;
    }
    static int multi(int x, int y){
        return x * y;
    }
    static int mod(int x, int y){
        return x % y;
    }
    static int areaOrPerimeter(int x, int y, int selectAreaOrPerimeter){
        if(selectAreaOrPerimeter == 1){
            return x*y;

        }
        else{
            return 2*(x+y);
        }
        
    }
    
}
