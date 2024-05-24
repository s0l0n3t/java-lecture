import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        float armut=2.14f;
        float elma=3.67f;
        float domates=1.11f;
        float muz=0.95f;
        float patlican=5.00f;
        float varTotal =0;

        Scanner mnvScanner = new Scanner(System.in);
        Scanner mnv1Scanner = new Scanner(System.in);
        Scanner mnv2Scanner = new Scanner(System.in);
        Scanner mnv3Scanner = new Scanner(System.in);
        Scanner mnv4Scanner = new Scanner(System.in);
        System.out.println("Aldığınız kadarını giriniz(kg).");
        System.out.print("Armut: ");
        armut *= mnvScanner.nextFloat();
        System.out.println("Aldığınız kadarını giriniz(kg).");
        System.out.print("Elma: ");
        elma *= mnv1Scanner.nextFloat();
        System.out.println("Aldığınız kadarını giriniz(kg).");
        System.out.print("Domates: ");
        domates *= mnv2Scanner.nextFloat();
        System.out.println("Aldığınız kadarını giriniz(kg).");
        System.out.print("Muz: ");
        muz *= mnv3Scanner.nextFloat();
        System.out.println("Aldığınız kadarını giriniz(kg).");
        System.out.print("Paltican: ");
        patlican *= mnv4Scanner.nextFloat();
        
        System.out.println("---------------------");
        varTotal = armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar: "+varTotal);
        mnv1Scanner.close();
        mnv2Scanner.close();
        mnv3Scanner.close();
        mnv4Scanner.close();
        mnvScanner.close();

    }
}
