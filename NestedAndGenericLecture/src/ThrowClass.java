

public class ThrowClass {
    public static void checkAge(int age) throws AgeChechException {
        if(age <18){
//            throw new ArithmeticException("Yaş tutmuyor !");
//            throw new InputMismatchException("Yaş tutmuyor: Mis matched sys input !");
            throw new AgeChechException("age error !");
        }
        System.out.println("başarılı");
    }

    public static void main(String[] args) {
        try {
            checkAge(8);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
