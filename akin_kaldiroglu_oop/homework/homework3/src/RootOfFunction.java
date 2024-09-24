import java.util.ArrayList;

public class RootOfFunction {

    public int calculateRoot(double a,double b,double c){
        // ax^2+bx+c = 0
        double discriminant = Math.pow(b*b - 4*a*c,0.5);
        double x1 = (-b + discriminant)/2*a;
        double x2 = (-b - discriminant)/2*a;
        System.out.println(a+"x^2+"+b+"x+"+c+" Quadratic Problem");
        if(discriminant > 0){
            System.out.println("both roots are real and different. It means there are two real solutions.");
            System.out.println("Root 1 : "+ x1+" Root 2 : " + x2);
        }
        else if(discriminant == 0){
            System.out.println("both roots are real and the same. It means we get one real solution.");
            System.out.println("Root 1 and Root 2 : "+ -b/2*a);
        }
        else {
            System.out.println("If the value of d is negative, both roots are distinct and imaginary or complex. It means that there are two complex solutions.");

        }

        return 1;
    }
}
