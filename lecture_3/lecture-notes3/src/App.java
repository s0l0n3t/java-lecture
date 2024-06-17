import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner coScanner = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int control_;
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a<=c);
        System.out.println(a>=c);
        System.out.println(d<=b);
        control_ = (a > b) ? 1 : 2; //doğru = 1, yanlış = 2
        System.out.println(control_);
        if(a>b){
            control_ = 1;

        }
        else{
            control_ = 2;
        }
        // eğer 2 tane koşul sorgulanmasını istersek
        if(a== b){
            control_ = 1;
        }
        if(a <b ){
            control_ = 2;
        // 2 if de çalışacaktır. if else olsaydı çalışmazdı.
        }
        else{
            control_ = 3;
        }



        switch(control_){
            case 2:
                control_ = 1;
                break;
            case 5:
                control_ = 10;
                break;// break switch-case'de kullanılması çok önemlidir.
            default:
            System.out.println("Default run !");
        }/* 
        int islem,firstS,secS;
        System.out.println("1- toplama\n2- Cikartma\n");
        // hesap makinesi:
        System.out.println("Hangi islem : ");
        islem = coScanner.nextInt();
        switch(islem){
            case 1:
                System.out.print("\n> ");
                firstS = coScanner.nextInt();
                System.out.print("\n> ");
                secS = coScanner.nextInt();
                System.out.print(firstS + secS);
                break;
            case 2:
                System.out.print("\n> ");
                firstS = coScanner.nextInt();
                System.out.print("\n> ");
                secS = coScanner.nextInt();
                System.out.println(firstS + secS);
                break;
            default:
                System.out.println("Bu islem gecerli degildir.");
        }*/
        
        String username,password;
        System.out.print("> ");
        username = coScanner.nextLine();
        
        System.out.print("> ");
        password = coScanner.nextLine();
        if(username.equals("root") && password.equals("1234")){
            System.out.println("Giris Basarili !");
            // string için equals kullanılmalı !
        }
        else{
            System.out.println("Tekrar deneyiniz !");
            System.out.println(password);
        }




    }
}
