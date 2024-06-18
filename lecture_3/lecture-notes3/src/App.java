import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


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
        /*
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
        }*//*
        int point1;
        int point;
        System.out.print("Not 1 >");
        point1 = coScanner.nextInt();
        System.out.print("Not 2 >");
        point = coScanner.nextInt();

        if(point > 0 && point < 100){
            System.out.println("Puan: ");
            System.out.println((point*0.4) + (point1*0.6));

        }*/

        /*
        int sicaklik;
        System.out.print("> ");
        sicaklik = coScanner.nextInt();
        if(sicaklik < 5){
            System.out.println("KAYAK");
        }
        if(sicaklik >= 5 && sicaklik <= 15){
            System.out.println("SİNEMA");
        }
        if(sicaklik > 10 && sicaklik < 25){
            System.out.println("PİKNİK");
        }
        else{
            System.out.println("YÜZME");
        } */
        /*
        int first=0,sec=0,third=0;

        System.out.println("> ");
        first = coScanner.nextInt();

        System.out.println("> ");
        sec = coScanner.nextInt();

        System.out.println("> ");
        third = coScanner.nextInt();
        if(first> sec && first > third){
            System.out.println("First is the biggest");

        }
        else if(sec > first && sec > third){
            System.out.println("Second is the biggest");
        }
        else if(third>first && third > sec){
            System.out.println("Third is the biggest");
        }
        else{
            System.out.println("There is equalisation !");
        }*//*
        int pathKm,age,type;
        double cash;

        System.out.print("KM> ");
        pathKm = coScanner.nextInt();

        System.out.print("age> ");
        age = coScanner.nextInt();

        System.out.print("type> \n1-Tek Yon\n2-Gidis-Donus ");
        type = coScanner.nextInt();
        cash = (pathKm * 10)/100;
        
        if (pathKm > 0 && age > 0 && type > 0 || type < 3){
        if(type == 2){
            cash *=2;
            cash = cash - cash * 0.20;
        }
        if (age < 12 ){
            cash = cash - (cash/2);

        }
        else if(age >= 12 && age <= 24){
            cash = cash - (cash*10)/100;
        }
        else if(age > 65){
            cash = cash - (cash*10)/100;
        }
        else{

        }}
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.println(cash);*/




        /*
        int month=0;
        System.out.print("Ay> ");
        month = coScanner.nextInt();
        switch(month%12){

            case 0:
            System.out.println("Maymun");
            case 1:
            System.out.println("Horoz");
            break;
            case 2:
            System.out.println("Köpek");
            break;
            case 3:
            System.out.println("Domuz");
            break;
            case 4:
            System.out.println("Fare");
            break;
            case 5:
            System.out.println("Okuz");
            break;
            case 6:
            System.out.println("Kaplan");
            break;
            case 7:
            System.out.println("Tavsan");
            break;
            case 8:
            System.out.println("Ejderha");
            break;
            case 9:
            System.out.println("Yılan");
            break;
            case 10:
            System.out.println("At");
            break;
            case 11:
            System.out.println("Koyun");
            break;
            default:
                break;

        }*/

        int year=0;
        System.out.print("Year> ");
        year = coScanner.nextInt();
        if(year %100 == 0){
            if(year %400 ==0){
                System.out.println("Artik yil !");
            }
            else{
                System.out.println("Artik Yil Degil !");
            }

        }
        else{
            if(year % 4 == 0){
                System.out.println("Artik yil !");
            }
            else{
                System.out.println("Artik yil değil !");
            }
        }
    }
}
