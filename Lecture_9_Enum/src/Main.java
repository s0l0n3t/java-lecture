public class Main {
    public static void main(String[] args) {
        System.out.println(Days.SALI.getDay());
        //Enum sınıflarda nesne üretilememektedir. Static sınıf olarak davranmaktadır.
        System.out.println(Gun.PAZARTESI.getDay());
    }
}