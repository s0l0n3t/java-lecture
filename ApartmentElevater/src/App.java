import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner apartmenScanner = new Scanner(System.in);
        Apartment floor = new Apartment((int)Math.ceil(Math.random()*12));

        while(true){
            
            System.out.println("Şuanda "+floor.getApartFloor()+ " katindasiniz.");
            System.out.println("""
                    1- Kattaki asansör durumu öğren.
                    2- Asansör çağir.
                    """);
            switch(apartmenScanner.nextInt()){
                case 1:
                    System.out.println("Asansör 1> "+floor.getElevator1Floor());
                    System.out.println("Asansör 2> "+floor.getElevator2Floor());
                    System.out.println("Asansör 3> "+floor.getElevator3Floor());
                    System.out.println("Asansör 4> "+floor.getElevator4Floor());
                    System.out.println("Asansör 5> "+floor.getElevator5Floor());
                break;

                case 2:
                System.out.println("Asansör numarası> ");
                int selector = apartmenScanner.nextInt();
                switch(selector){
                    case 1:
                    floor.callElevater1();
                    System.out.println("Kat numarası> ");
                    int floorNumber= apartmenScanner.nextInt();
                    if(floor.getApartFloor() > floorNumber){
                        
                        for(int i = floor.getApartFloor();i>=floorNumber;i--){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();


                    }
                    else if(floor.getApartFloor() < floorNumber){
                        for(int i = floor.getApartFloor();i<=floorNumber;i++){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();
                    }
                    else{

                    }
                    System.out.println("Asansör zili !");
                    floor.setElevator1Floor(floorNumber);
                    floor.setApartFloor(floorNumber);
                    break;
                    case 2:
                    floor.callElevater2();
                    System.out.println("Kat numarası> ");
                    int floorNumber1= apartmenScanner.nextInt();
                    if(floor.getApartFloor() > floorNumber1){
                        
                        for(int i = floor.getApartFloor();i>=floorNumber1;i--){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();


                    }
                    else if(floor.getApartFloor() < floorNumber1){
                        for(int i = floor.getApartFloor();i<=floorNumber1;i++){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();
                    }
                    else{

                    }
                    System.out.println("Asansör zili !");
                    floor.setElevator2Floor(floorNumber1);
                    floor.setApartFloor(floorNumber1);
                    break;
                    case 3:
                    floor.callElevater3();
                    System.out.println("Kat numarası> ");
                    int floorNumber2= apartmenScanner.nextInt();
                    if(floor.getApartFloor() > floorNumber2){
                        
                        for(int i = floor.getApartFloor();i>=floorNumber2;i--){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();


                    }
                    else if(floor.getApartFloor() < floorNumber2){
                        for(int i = floor.getApartFloor();i<=floorNumber2;i++){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();
                    }
                    else{

                    }
                    System.out.println("Asansör zili !");
                    floor.setElevator3Floor(floorNumber2);
                    floor.setApartFloor(floorNumber2);
                    break;
                    case 4:
                    floor.callElevater4();
                    System.out.println("Kat numarası> ");
                    int floorNumber4= apartmenScanner.nextInt();
                    if(floor.getApartFloor() > floorNumber4){
                        
                        for(int i = floor.getApartFloor();i>=floorNumber4;i--){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();


                    }
                    else if(floor.getApartFloor() < floorNumber4){
                        for(int i = floor.getApartFloor();i<=floorNumber4;i++){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();
                    }
                    else{

                    }
                    System.out.println("Asansör zili !");
                    floor.setElevator4Floor(floorNumber4);
                    floor.setApartFloor(floorNumber4);
                    break;
                    case 5:
                    floor.callElevater5();
                    System.out.println("Kat numarası> ");
                    int floorNumber5= apartmenScanner.nextInt();
                    if(floor.getApartFloor() > floorNumber5){
                        
                        for(int i = floor.getApartFloor();i>=floorNumber5;i--){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();


                    }
                    else if(floor.getApartFloor() < floorNumber5){
                        for(int i = floor.getApartFloor();i<=floorNumber5;i++){
                            System.out.println("Kat: "+i);
                        }
                        System.out.println();
                    }
                    else{

                    }
                    System.out.println("Asansör zili !");
                    floor.setElevator5Floor(floorNumber5);
                    floor.setApartFloor(floorNumber5);
                    break;

                }
                break;

            }
        }
    }
    
}
