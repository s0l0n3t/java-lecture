import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner varScanner = new Scanner(System.in);
        System.out.println("""
                1 - January
                2 - February
                3 - March
                4 - April
                5 - May
                6 - June
                7 - July
                8 - August
                9 - September
                10 - October
                11 - November
                12 - December
                """);
        System.out.print("MONTH NUMBER > ");
        SwitchDemo demo = new SwitchDemo(varScanner.nextInt());
        System.out.println("MONTH : "+demo.getMonth());
        System.out.println("SEASON : " + demo.getSeason());

    }
}